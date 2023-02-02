package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App7 {

    private static final Logger LOGGER = LoggerFactory.getLogger("app7");

    public static void main(String[] args) {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("Result: {}", calculate());
        }
    }

    private static int calculate() {
        System.out.println("Calculating...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 10;
    }
}
