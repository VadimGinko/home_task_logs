import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SimpleLogger {
    private static final Logger logger = LoggerFactory.getLogger(
            SimpleLogger.class);

    public static void writeLog(String log){
        logger.info(log);

    }

}
