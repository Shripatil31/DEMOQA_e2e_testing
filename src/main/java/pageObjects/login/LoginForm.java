package pageObjects.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.PageObject;

public class LoginForm extends PageObject {

    @FindBy(id = "userName")
    private WebElement inputUsername;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(id = "login")
    private WebElement buttonLogin;

    @FindBy(id = "name")
    private WebElement error;

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://demoqa.com/login");
    }

    public void login(String username, String password) {
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        executor.executeScript("arguments[0].scrollIntoView(true);", buttonLogin);
        buttonLogin.click();
    }

    public boolean isErrorDisplayed() {
        return error.isDisplayed();
    }
}
