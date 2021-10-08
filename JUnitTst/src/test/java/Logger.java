import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logger {

    private org.apache.logging.log4j.Logger logger = LogManager.getLogger(Logger.class);
    protected static WebDriver driver;

    @Before
    public void StartUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Драйвер поднят");
    }

    @After
    public void End(){
        if (driver!=null)
            driver.quit();
    }

    @Test
    public void LogExample(){
        logger.info("Тест старт");
    }

    @Test
    public void WebDriverTest(){
        driver.get("https://otus.ru");
        logger.info("Сайт открыт");
        String actual = driver.getTitle();
        Assert.assertEquals("", actual);
    }
}
