package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jDemo {
	private static Logger logger = LogManager.getLogger("Log4jDemo.class");
	
	public static void main(String[] args) {
		
		System.out.println("\n Hello World....!\n");
		
		logger.trace("this is a trace msg");
		logger.info("this is info msg");
		logger.error("this is an error msg");
		logger.warn("this is a warn msg");
		logger.fatal("This is a fatal msg");
		
		System.out.println("\n  Completed");
	}

}
