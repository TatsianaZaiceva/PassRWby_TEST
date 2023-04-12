package PassRwBy.tests.ui.pages;

import PassRwBy.tests.ui.set.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static PassRwBy.tests.ui.set.DriverSet.driver;

public class MainPage {
    public final By POPUP_NOTIFICATION = By.xpath("//div[@id='notification-popup']");
    public final By NOT_TO_SHOW_POPUP_NOTIFICATION = By.xpath("//div[@class='notification-modal__header']/button[@class='close close--black']");
    public static final String ButtonMyAccount = "//li[@class='item_1 cabinet']";
    public static final String TitleLogin = "//div[@class='auth-modal__header']";
    public MainPage closePopupNotification(){
        Util.waitFor(5);
        if(driver.findElement(POPUP_NOTIFICATION).isDisplayed()) {
            driver.findElement(NOT_TO_SHOW_POPUP_NOTIFICATION).click();
        }
        return this;
    }
    public MainPage openLoginForm(){
        driver.findElement(By.xpath(ButtonMyAccount)).click();
        new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TitleLogin)));
        return this;
    }
}
