import org.junit.Test;

import org.apache.logging.log4j.LogManager;

public class logEx {

    private  org.apache.logging.log4j.Logger logger =  LogManager.getLogger(logEx.class);


    @Test
    public void logTest() {
        logger.info("Тест запущен");

    }


}
