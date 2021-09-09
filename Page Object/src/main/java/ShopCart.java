import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopCart {

    public void ShopCart() {
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();

        driver.findElement(By.xpath("a[@title=\"Корзина\"]")).click();
        String Name =  driver.findElement(By.xpath("li[@itemprop=\"name\"]")).getText();
        String NameTrue = "MICKE МИККЕ";
        if (Name == NameTrue) {
            System.out.println("В корзине верный товар");
        }

        driver.findElement(By.xpath("a[@data-testid=\"remove-00373919\"]")).click(); // Удалить товар из корзины
        String logo =  driver.findElement(By.xpath("h2[@class=\"noProducts_header__2mpUZ\"]")).getText();
        String logoTrue = "Ваша корзина пуста";
        if (logo == logoTrue) {
            System.out.println("Товар удалился");
        }







    }
}
