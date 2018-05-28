package utility.specific;

import org.apache.log4j.Logger;

public class LogUtil 
{
	/* this will be a global object that contains a singleton instance of any loggers
	*  are needed. All these loggers will be in the log4j.properties file
	*/
	private Logger dylanLogger;
	private static LogUtil logUtil;
	private LogUtil()
	{
		this.dylanLogger = Logger.getLogger("dylanLogger");
	}
	
	public static synchronized LogUtil getMasterLogger()
	{
		if(null==logUtil)
		{
			logUtil = new LogUtil();
		}
		return LogUtil.logUtil;
	}
	
	public void dylanLoggerDEBUG(String message)
	{
		this.dylanLogger.debug(message);
	}
	
}
