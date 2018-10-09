package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-eb-Alerts\"]/div/button")
    public static WebElement bellButton;
    @FindBy(css = "#ghn-err")
    public static WebElement clickOnSignIn;
    @FindBy(id = "gh-cat-box")
    WebElement categories;

//    public void goToLoginPage() {
//        bellButton.click();
//        clickOnSignIn.click();
//    }

    public void click(){
        categories.click();
    }
}
