package pageObjects.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.PageObject;

public class ProfilePage extends PageObject {

    @FindBy(id = "submit")
    private WebElement buttonLogout;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoggedIn() {
        return buttonLogout.isDisplayed();
    }

}
