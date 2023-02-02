package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App6 {

    private static final Logger LOGGER = LoggerFactory.getLogger("app6");

    public static void main(String[] args) {

        try {
            throw new RuntimeException("Ops!");
        } catch (RuntimeException e) {
            LOGGER.error("Error: " + e.getMessage(), e);
        }
    }
}
