package pageObjects.student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.PageObject;

public class StudentForm extends PageObject {

    @FindBy(id = "firstName")
    private WebElement inputFirstName;

    @FindBy(id = "lastName")
    private WebElement inputLastName;

    @FindBy(id = "userEmail")
    private WebElement inputEmail;

    @FindBy(xpath = "//label[text()='Male']")
    private WebElement genderMale;

    @FindBy(id = "userNumber")
    private WebElement inputPhone;

    @FindBy(id = "submit")
    private WebElement buttonSubmit;

    public StudentForm(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    public StudentForm setFirstName(String firstName) {
        inputFirstName.sendKeys(firstName);

        return this;
    }

    public StudentForm setLastName(String lastName) {
        inputLastName.sendKeys(lastName);

        return this;
    }

    public StudentForm setEmail(String email) {
        inputEmail.sendKeys(email);

        return this;
    }

    public StudentForm selectMaleGender() {
        executor.executeScript("arguments[0].scrollIntoView(true);", genderMale);
        genderMale.click();

        return this;
    }

    public StudentForm setMobile(String phone) {
        inputPhone.sendKeys(phone);

        return this;
    }

    public void submit() {
        buttonSubmit.click();
    }

}
