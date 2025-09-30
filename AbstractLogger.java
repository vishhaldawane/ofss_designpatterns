public abstract class AbstractLogger { //ConsoleLogger cl  = ..; cl.setNextLogger(el);
   public static int INFO = 1; //console
   public static int DEBUG = 2; //file
   public static int ERROR = 3; // error

   protected int level;

   //next element in chain or responsibility
   protected AbstractLogger nextLogger; //hasA

   public void setNextLogger(AbstractLogger nextLogger){
      this.nextLogger = nextLogger;
   }

   public void logMessage(int level, String message){
	  
	  System.out.println("\nS----Current Logger : "+this);
	  System.out.println("S----if ("+this.level+ "<="+ level+")-------------"+level);
      if(this.level <= level){
         write(message);//invoked for all the loggers one by one
      }
      
      if(nextLogger !=null){
    	 System.out.println("nextLogger : "+nextLogger);
         nextLogger.logMessage(level, message);
      }
	  System.out.println("E-----------------"+level);

   }

   abstract protected void write(String message);
   
   
   
   
	
}