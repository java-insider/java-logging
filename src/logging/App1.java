package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(App1.class);

    public static void main(String[] args) {
        LOGGER.info("This is my first log message!");
        LOGGER.debug("This is a debug message");
    }
}
