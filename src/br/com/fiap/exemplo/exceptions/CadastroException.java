package br.com.fiap.exemplo.exceptions ;


public class CadastroException extends Exception
{
	private String message ;

	public String getMessage( )
	{
		return message ;
	}

	public void setMessage( String message )
	{
		this.message = message ;
	}

}
