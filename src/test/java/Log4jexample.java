import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jexample {

	public static Logger log=LogManager.getLogger(Log4jexample.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.info("INFO message logged");
		log.debug("Debug message logged");
		log.error("ERROR message logged");
		log.trace("TRACE message logged");

	}

}
