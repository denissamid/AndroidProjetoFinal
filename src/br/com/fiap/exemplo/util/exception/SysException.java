package br.com.fiap.exemplo.util.exception;


/**
 * Responsável por lançar a exceção SysException
 *
 * @version 1.0
 */
public abstract class SysException extends LayerException
{

	/**
	 * Método construtor para SysException
	 */
   	public SysException()
   	{
 		super();
 	}

	/**
	 * Método construtor para SysException
	 */
   	public SysException(MsgException msg)
   	{
   		super(msg);
 	}

	/**
	 * Método construtor para SysException
	 */
 	public SysException(MsgExceptionList list)
 	{
 		super(list);
 	}
}
