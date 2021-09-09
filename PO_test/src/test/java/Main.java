import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
    WebDriver driver;
    WebDriverWait wait;


    @Before
    public void start () {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        driver.manage().window().maximize();
    }

    @After
    public void close () {
        driver.quit();
    }

}
