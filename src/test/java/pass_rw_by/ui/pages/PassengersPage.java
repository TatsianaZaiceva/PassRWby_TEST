package pass_rw_by.ui.pages;

import org.openqa.selenium.By;

import static pass_rw_by.ui.set.DriverSet.driver;

public class PassengersPage {
    public static final By FIRST_NAME_FORM = By.xpath("//input[@name='first_name_1']");
    public static final By MIDDLE_NAME_FORM = By.xpath("//input[@name='middle_name_1']");
    public static final By LAST_NAME_FORM = By.xpath("//input[@name='last_name_1']");
    public static final By DOCUMENT_FORM = By.xpath("//input[@name='document_number_1']");
    public static final By ACCEPT_THE_RULES = By.xpath("//div[@class='jq-checkbox__div']");
    public final By BUTTON_CHECKOUT = By.xpath("//button[@class='btn btn-default info-form__submit']");

    public PassengersPage inputLastName(String LastName) {
        driver.findElement(LAST_NAME_FORM).sendKeys(LastName);
        return this;
    }
    public PassengersPage inputFirstName(String FirstName) {
        driver.findElement(FIRST_NAME_FORM).sendKeys(FirstName);
        return this;
    }
    public PassengersPage inputMiddleName(String MiddleName) {
        driver.findElement(MIDDLE_NAME_FORM).sendKeys(MiddleName);
        return this;
    }
    public PassengersPage inputDocumentNumber(String DocumentNumber) {
        driver.findElement(DOCUMENT_FORM).sendKeys(DocumentNumber);
        return this;
    }
    public PassengersPage cLickCheckout() {
        driver.findElement(ACCEPT_THE_RULES).click();
        driver.findElement(BUTTON_CHECKOUT).click();
        return this;
    }
}
