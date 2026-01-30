package testng_Demo;
import  org.apache.logging.log4j.*;
import org.testng.annotations.Test;

public class LoggingLog4j {
 @Test
	public void name() {
		Logger log=LogManager.getLogger("LoggingLog4j");
		System.out.println("this is logger demo");
		
		log.info("for info only");
		log.error("error message ");
		log.debug("for debug");
		log.warn("warning message");
	}
	
}
