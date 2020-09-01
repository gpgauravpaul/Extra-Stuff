import org.apache.commons.logging.*;
import org.apache.logging.log4j.*;
public class Log4J {
    private static Logger log = LogManager.getLogger (Log4J.class.getName ());
    public static void main (String[] args) {

        log.info ("Info");
        log.error ("Error");
        log.debug ("debug");
        log.trace ("trace");

    }
}

