package stepik.step4.excep43.excep438;

import java.util.logging.*;

public class Log {

    private static void configureLogging() {

        final Logger logger = Logger.getLogger("org.stepic.java.logging.ClassA");
        final Logger logger2 = Logger.getLogger("org.stepic.java.logging.ClassB");
        logger.setLevel(Level.ALL);
        logger2.setLevel(Level.WARNING);

        final Logger logger3 = Logger.getLogger("org.stepic.java");
        logger3.setLevel(Level.ALL);
        Handler handler3 = new ConsoleHandler();
        handler3.setLevel(Level.ALL);
        handler3.setFormatter(new XMLFormatter());
        logger3.addHandler(handler3);
        logger3.setUseParentHandlers(false);
    }
}
