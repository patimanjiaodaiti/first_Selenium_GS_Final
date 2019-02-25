package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton_CheckBox_Handiling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.etsy.com");
        driver.manage().window().maximize();

        WebElement searchBox= driver.findElement(By.xpath(".//input[@id='search-query']"));
        searchBox.sendKeys("Wooden spoon"+ Keys.ENTER);
        // Implicity wait:
        // makes time out for HTML codes to be fully uploaded so that
        // findElements will work properly
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Mylibrary.TakeScreenShot(driver,"patima");
        JavascriptExecutor mm=(JavascriptExecutor)driver;
        mm.executeScript("scroll(0,2000)");

    }
}
