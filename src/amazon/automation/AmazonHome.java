package amazon.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonHome {
    public static void main(String [] args){
      System.setProperty("webdriver.chrome.driver", "/Users/matiur/develop/aint/SeleniumProject1/driver/chromedriver");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.amazon.com/");
      driver.manage().window().maximize();
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);
      driver.findElement(By.id("twotabsearchtextbox")).clear();
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Honey", Keys.ENTER);
      driver.close();

    }
}
