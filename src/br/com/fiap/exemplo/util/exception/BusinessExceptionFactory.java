package br.com.fiap.exemplo.util.exception;

import java.util.Iterator;



/**
 * Respons�vel por criar as Exce��es de Neg�cios
 *
 * @version 1.0
 */
public class BusinessExceptionFactory
{

	/**
	 * M�todo utilizado para obter uma exce��o Business Exception
	 *
	 * @param	MsgExceptionList	informar uma lista do tipo MsgExceptionList
	 * @return 	BusinessException
	 * @see		MsgExceptionList
	 */
 	public static BusinessException getException(MsgExceptionList list)
 	{
		Iterator iterator = list.getMsgException().iterator();
		while (iterator.hasNext())
		{
			MsgException msg = (MsgException) iterator.next() ;
			if (Environment.getLogTraceSystemOut())
			{
					System.out.println ("--------------------------------:::     Exception Details      :::---------------------------------------");
					System.out.println (" Exception(logger) ->  [code]: " + msg.getCode() + " [message]: " + msg.getDetails());
					System.out.println ("--------------------------------:::   Exception Information    :::---------------------------------------");
			}
		}
		return new BusinessException(list);
	}

   }
