import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

public class logEx {

    private  org.apache.logging.log4j.Logger logger =  LogManager.getLogger(logEx.class);


    @Test
    public void logTest() {
        logger.info("Тест запущен");

    }


}
