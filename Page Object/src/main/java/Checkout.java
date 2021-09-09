import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout {

    public void Checkout() {
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();

        driver.findElement(By.xpath("button[@class=\"cart-ingka-jumbo-btn cart-ingka-jumbo-btn--emphasised orderCaptureRedirect_onlyLg__3Ek4Y\"]")).click(); // Оформить заказ
        driver.findElement(By.xpath("input[@type=\"text\"]")).sendKeys("г Москва, Мичуринский пр-кт, д 12 к 2");
        driver.findElement(By.xpath("div[@class=\"page-layout__grid\"]")).click();







    }
}
