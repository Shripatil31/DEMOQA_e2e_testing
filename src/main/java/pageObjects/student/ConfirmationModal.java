package pageObjects.student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.PageObject;

public class ConfirmationModal extends PageObject {

    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement title;

    public ConfirmationModal(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        return title.isDisplayed();
    }

}
