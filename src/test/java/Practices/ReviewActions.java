package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.Map;

public class ReviewActions {
    WebDriver driver;
    //all the external execution
    Actions act = new Actions(driver);
    public void example() throws InterruptedException {
        WebElement xx=null;
        act.moveToElement(xx);
        act.moveToElement(xx).perform();
        act.moveToElement(xx).click().sendKeys("searItem").sendKeys(Keys.ENTER).perform();
        act.pause(3000).perform();
        //pause method sleeps the web browser
        Thread.sleep(3000);
        //it makes the java to sleep
    }
    public static void main (String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
        search.sendKeys("gfghhg");
        Mylibrary.sleep(2);
        search.sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);

        new Actions(driver).moveToElement(search).sendKeys("ughgfh").perform();
        for (int i=0; i<3; i++){
            new Actions(driver).sendKeys(Keys.BACK_SPACE).perform();
        }
    }
}
