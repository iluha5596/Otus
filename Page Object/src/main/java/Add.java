import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Add {

    public void Add() {

        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();

        driver.findElement(By.xpath("button[@aria-label=\"Добавить в корзину\"]")).click(); // Добавить в козину
        driver.findElement(By.xpath("//div[@class=\"rec-modal rec-slide-enter\"]")).sendKeys(Keys.ESCAPE);



    }
}
