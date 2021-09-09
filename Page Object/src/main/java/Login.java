import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver = new ChromeDriver();

    WebElement loginInput = driver.findElement(By.id("input_username"));
    WebElement passInput = driver.findElement(By.id("input_password"));
    WebElement enter = driver.findElement(By.id("login_btn_signin"));

    public void login (String login, String pass) {
        loginInput.sendKeys(login);
        passInput.sendKeys(pass);
        enter.click();
    }







}
