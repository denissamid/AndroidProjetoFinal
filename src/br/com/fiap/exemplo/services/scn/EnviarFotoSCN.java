package br.com.fiap.exemplo.services.scn ;


import java.util.Timer ;
import java.util.TimerTask ;

import org.apache.log4j.Logger ;

import android.os.Handler ;
import br.com.fiap.exemplo.services.tasks.ExecuteRegistrarFotoTask ;
import br.com.fiap.exemplo.util.Environment ;

public class EnviarFotoSCN 
{
	private static final Logger log = Logger.getLogger( EnviarFotoSCN.class ) ;
	
	public static void callAsynchronousTask( )
	{
		final Handler handler = new Handler( ) ;
		Timer timer = new Timer( ) ;
		TimerTask doAsynchronousTask = new TimerTask( )
		{
			@Override
			public void run( )
			{
				handler.post( new Runnable( )
				{
					public void run( )
					{
						try
						{
							ExecuteRegistrarFotoTask registrarFotoTask = new ExecuteRegistrarFotoTask( ) ;
							registrarFotoTask.execute( ) ;
						}
						catch (Exception e)
						{
							e.printStackTrace( ) ;
							log.error( e.getMessage( ), e) ;
						}
					}
				} ) ;
			}
		} ;
		timer.schedule( doAsynchronousTask, 0, Environment.TIMER_PHOTO ) ;
	}
}
