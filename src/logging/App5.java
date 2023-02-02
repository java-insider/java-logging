package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App5 {

    private static final Logger LOGGER = LoggerFactory.getLogger("app5");

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        LOGGER.info("X = " + x + "; Y = " + y);
        LOGGER.info("X = {}; Y = {}", x, y);
    }
}
