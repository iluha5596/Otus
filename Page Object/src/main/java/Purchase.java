import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class Purchase {
    public void purchase() {

        WebDriver driver = new ChromeDriver();

        driver = new ChromeDriver();
        driver.get("https://www.ikea.com/ru/ru/");



        Search search = PageFactory.initElements(driver, Search.class);
        search.Search();

        Add add = PageFactory.initElements(driver, Add.class);
        add.Add();

        ShopCart shop = PageFactory.initElements(driver, ShopCart.class);
        shop.ShopCart();

        Checkout check = PageFactory.initElements(driver, Checkout.class);
        check.Checkout();

        driver.quit();







    }

}
