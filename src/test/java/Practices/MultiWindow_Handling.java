package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class MultiWindow_Handling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        //new tab:
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        Mylibrary.sleep(3);
        //driver.navigate().to("https://www.etsy.com/");
        //driver can't switch it self so it will open on amazon window


        //we use collection to open the url in new window
        //List(ArrayList, linkList, vector) - Set(hashSet and sortedSet) - Map(hasMap,TreeSet)
        //getWindowHandles=>return collection, collection is bigger than list so cannot direct assign.
        //we use ArrayList assign the getWindowHandles to the List
        //Switch between tabs:
        List<String> allwindows=new ArrayList(driver.getWindowHandles());
        String window1=allwindows.get(0),
               window2=allwindows.get(2),
               window3=allwindows.get(1),
               window4=allwindows.get(3);
        driver.switchTo().window(window2);
        driver.get("https://www.etsy.com/");
        driver.switchTo().window(window3);
        driver.get("https://www.youtube.com");
        driver.switchTo().window(window4);
        driver.get("https://www.walmart.com/");








    }
}
