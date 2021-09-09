import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

    public void Search() {

        WebDriver driver = new ChromeDriver();

        driver = new ChromeDriver();

        try {
            Thread.sleep(2000);

            driver.findElement(By.xpath("input[@name=\"q\"]")).sendKeys("стол письменный", Keys.ENTER); //Поиск товара
            Thread.sleep(1000);

            driver.findElement(By.xpath("a[@aria-label=\"MICKE МИККЕ - Письменный стол\"]")).click(); //Провалиться в товар


        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        }


}
