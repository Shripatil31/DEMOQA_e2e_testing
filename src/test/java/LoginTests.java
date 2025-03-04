import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.login.LoginForm;
import pageObjects.login.ProfilePage;

import static com.google.common.truth.Truth.assertThat;

public class LoginTests {
    private ChromeDriver driver;
    private LoginForm form;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        form = new LoginForm(driver);
        form.open();
    }

    @Test
    public void login_validCredentials_LogsIn() {
        form.login("Shri31", "Shri@0401");

        var profilePage = new ProfilePage(driver);

        assertThat(profilePage.isLoggedIn()).isTrue();
    }

    @Test
    public void login_invalidCredentials_AnErrorDisplayed() {
        form.login("a", "b");

        assertThat(form.isErrorDisplayed()).isTrue();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
