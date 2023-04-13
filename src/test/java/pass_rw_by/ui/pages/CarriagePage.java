package pass_rw_by.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pass_rw_by.ui.set.Util;
import org.openqa.selenium.By;

import java.time.Duration;

import static pass_rw_by.ui.set.DriverSet.driver;

public class CarriagePage {
    public static final By CARRIAGE_LIST = By.xpath("//div[@id='carriage-collapse-list']");
    public static final By CARRIAGE_WITH_FREE_SEATS = By.xpath("//div[@class='pl-accord__cell cell-1']");
    public static By BUTTON_INPUT_PASSENGERS_DATA = By.xpath("//a[@class='btn btn-index-2']");

    public CarriagePage chooseTheFirstFreeCarriage() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.visibilityOfElementLocated(CARRIAGE_LIST));
        driver.findElement(CARRIAGE_WITH_FREE_SEATS).click();
        return this;
    }
    public CarriagePage chooseTheSeatBySystem() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(BUTTON_INPUT_PASSENGERS_DATA));
        driver.findElement(BUTTON_INPUT_PASSENGERS_DATA).click();
        return this;
    }
}


