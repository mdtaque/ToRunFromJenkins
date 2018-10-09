package TestHome;

import Base.CommonAPI;
import HomePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    HomePage objOfHomePage;

    @BeforeMethod
    public void initialization(){
        objOfHomePage = PageFactory.initElements(CommonAPI.driver, HomePage.class);
    }
    //@Test
//    public void search(){
//        driver.get("https://www.ebay.com/");
//        objOfHomePage.goToLoginPage();
//    }

    @Test
    public void test1(){
        driver.get("https://www.ebay.com/");
        objOfHomePage.click();
    }

}
