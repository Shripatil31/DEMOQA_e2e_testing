import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.student.ConfirmationModal;
import pageObjects.student.StudentForm;

import static com.google.common.truth.Truth.assertThat;

public class StudentFormTests {
    private ChromeDriver driver;
    private StudentForm form;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        form = new StudentForm(driver);
        form.open();
    }

    @Test
    public void submit_requiredValues_RegistersStudent() {
        form
            .setFirstName("John")
            .setLastName("Smith")
            .setEmail("jsmith@gmail.com")
            .selectMaleGender()
            .setMobile("1231231231")
            .submit();

        var confirmationModal = new ConfirmationModal(driver);

        assertThat(confirmationModal.isDisplayed()).isTrue();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
