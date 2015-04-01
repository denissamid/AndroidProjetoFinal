package br.com.fiap.exemplo.util.exception;


public final class Environment
{

	public static final int PRODUCAO 			= 1;
	public static final int DESENVOLVIMENTO 	= 2;

	/**
	 * M�todo construtor para Ambiente
	 */
 	private Environment()
 	{
	}


	public static int getEnvironment()
	{
		return DESENVOLVIMENTO;
	}

	public static boolean getLogTraceFile()
	{
		return true;
	}

	public static boolean getLogTraceSystemOut()
	{
		return false;
	}
}


