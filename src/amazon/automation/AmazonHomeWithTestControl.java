package amazon.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonHomeWithTestControl {

    WebDriver driver = null;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/matiur/develop/aint/SeleniumProject1/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

    @Test
    public void test1(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
    }

    @Test
    public void test2(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Honey", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
    }
}
