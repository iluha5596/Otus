import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Add_Delete {

    public void Add_Delete() {

        WebDriver driver = new ChromeDriver();

        driver = new ChromeDriver();
        driver.get("https://www.ikea.com/ru/ru/");


        Search search = PageFactory.initElements(driver, Search.class);
        search.Search();

        Add add = PageFactory.initElements(driver, Add.class);
        add.Add();

        ShopCart shop = PageFactory.initElements(driver, ShopCart.class);
        shop.ShopCart();





    }
}

