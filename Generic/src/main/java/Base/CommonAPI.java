package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;
    @BeforeMethod
    public void SetUpDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/mdtaque/SELENIUM/AutoJenkins/Generic/driver/chromedriver");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.ebay.com/");

    }
    @AfterMethod
    public void cleanup() {
        driver.close();
    }
    public String getTextByCss(String locator) {
        String st = driver.findElement(By.cssSelector(locator)).getText();
        return st;
    }
    public void switchWindow(WebDriver driver) {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }
}
