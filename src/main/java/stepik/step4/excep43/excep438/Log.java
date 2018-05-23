package stepik.step4.excep43.excep438;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {

    private static Logger logger = Logger.getLogger("org.stepic.java.logging.ClassA");
    private static final Logger logger2 = Logger.getLogger("org.stepic.java.logging.ClassB");



    private static void configureLogging() {
        logger.log(Level.SEVERE, "Error doing XYZ");
    }
}
