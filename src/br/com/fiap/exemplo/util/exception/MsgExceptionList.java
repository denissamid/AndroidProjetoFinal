package br.com.fiap.exemplo.util.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Respons�vel por manipular uma cole��o de MsgException
 *
 * @version 1.0
 */
public class MsgExceptionList implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Collection msgException = null ;

	/**
	 * M�todo construtor para MsgExceptionList
	 */
	public MsgExceptionList()
	{
		this.msgException = new ArrayList() ;
	}

	/**
	 * M�todo construtor para MsgExceptionList
	 */
	public MsgExceptionList(MsgException msg)
	{
		this.msgException = new ArrayList() ;
		this.msgException.add(msg);
	}

	/**
	 * M�todo utilizado para obter uma cole��o de  MsgException
	 *
	 * @return 	Collection
	 */
	public Collection getMsgException()
	{
		return msgException;
	}

	/**
	 * M�todo utilizado para informar uma cole��o de MsgException
	 *
	 * @param 	msgException 	informar uma cole��o de MsgException a ser configurada
	 */
	public void setMsgException(Collection msgException)
	{
		this.msgException = new ArrayList() ;
		this.msgException = msgException;
	}

	/**
	 * M�todo utilizado para adicionar uma cole��o de  MsgException
	 *
	 * @param	msg 	informar uma MsgException para ser adicionada a cole��o de MsgException
	 */
	public void addMsgException(MsgException msg)
	{
		this.msgException.add(msg);
	}

	/**
	 * M�todo utilizado para remover uma cole��o de  MsgException
	 *
	 * @param	msg 	informar uma MsgException para ser removida da cole��o de MsgException
	 */
	public void removeMsgException(MsgException msg)
	{
		this.msgException.remove(msg);
	}
}