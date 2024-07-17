package files.lesson_4_4_8;

import java.util.logging.*;

public class LoggerExample {

    public static void logging() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");

        logger.info("All good");
        logger.warning("An error occurred");
    }
}
