
public class _20ChainPatternDemo {
	
	private static AbstractLogger getChainOfLoggers()
	{
      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);//3
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);//2
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);//1

      errorLogger.setNextLogger(fileLogger);//3->2
      fileLogger.setNextLogger(consoleLogger);//2->1
      return errorLogger;	
   }
	

	public static void main(String[] args) {
	   AbstractLogger loggerChain = getChainOfLoggers();

	   loggerChain.logMessage(AbstractLogger.INFO, 
		        "This is an information.");
	   
	 /*  System.out.println("**********");

	   loggerChain.logMessage(AbstractLogger.DEBUG, 
		        "This is a debug level information.");

	   System.out.println("**********");

	   
	   
	   loggerChain.logMessage(AbstractLogger.ERROR, 
		         "This is an error information.");*/
	}
}