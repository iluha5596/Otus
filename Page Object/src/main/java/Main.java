import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Main {
    public static void main (String[] args)  {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {

            driver.get("https://store.steampowered.com/login/and?l=russian");
            Thread.sleep(2000);

            Login lp = new Login();
            lp.login("iluha5596", "IP9162385423ip");



        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }


    }


}