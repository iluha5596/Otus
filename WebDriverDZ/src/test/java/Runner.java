import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Runner {

    private org.apache.logging.log4j.Logger logger = LogManager.getLogger(Logger.class);
    protected static WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Драйвер поднят");
        wait = new WebDriverWait(driver, 10);
    }
     @AfterClass
    public void end() {
        if (driver!=null)
            driver.quit();
     }

    private void auth() throws InterruptedException{
        driver.get("https://otus.ru");
        logger.info("Сайт открыт");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"header2__auth js-open-modal\"]")));
        driver.findElement(By.xpath("//button[@class=\"header2__auth js-open-modal\"]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder=\"Электронная почта\"])[3]")));
        driver.findElement(By.xpath("(//input[@placeholder=\"Электронная почта\"])[3]")).sendKeys("@mail.ru");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("qwerty123");
        driver.findElement(By.xpath("(//button[@type=\"submit\"])[3]")).click();
        logger.info("Авторизация прошла");
    }

     @Test
    public void duckduckgo() throws InterruptedException {
         driver.quit();
         ChromeOptions options = new ChromeOptions();
         options.addArguments("headless");
         driver = new ChromeDriver(options);
         driver.get("https://duckduckgo.com/");
         driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Отус", Keys.ENTER);
         Assert.assertEquals("Онлайн‑курсы для профессионалов, дистанционное обучение...", driver.findElement(By.xpath("//a[text() = \"Онлайн‑курсы для профессионалов, дистанционное обучение...\"]")).getText());
         logger.info("В поисковой выдаче первый результат 'Онлайн‑курсы для профессионалов, дистанционное обучение...'");
    }

    @Test
    public void modalWindow() throws InterruptedException {
        driver.quit();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--kiosk");
        driver = new ChromeDriver(options);
        driver.get("https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818");
        driver.findElement(By.xpath("(//div[@class=\"content-overlay\"])[1]")).click();
        driver.findElement(By.xpath("//div[@class=\"pp_pic_holder light_rounded\"]")).isDisplayed();
        logger.info("Картинка открылась в модальном окне");
    }

    @Test
    public void cookie() throws InterruptedException {
        auth();
        logger.info(driver.manage().getCookies());
        logger.info("Логи собраны");

    }

}
