package PassRwBy.tests.ui.pages;

import PassRwBy.tests.ui.set.Util;
import org.openqa.selenium.By;

import static PassRwBy.tests.ui.set.DriverSet.driver;

public class CarriagePage {
    public static final By CARRIAGE_LIST = By.xpath("//div[@id='carriage-collapse-list']");
    public static final By CARRIAGE_WITH_FREE_SEATS = By.xpath("//div[@class='pl-accord__cell cell-1']");
    public static By BUTTON_INPUT_PASSENGERS_DATA = By.xpath("//a[@class='btn btn-index-2']");

    public CarriagePage chooseTheFirstFreeCarriage() {
        Util.waitForVisibilityOfElement(driver, CARRIAGE_LIST, 1);
        driver.findElement(CARRIAGE_WITH_FREE_SEATS).click();
        return this;
    }

    public CarriagePage chooseTheFirstFreeSeat() {
        //Util.waitForVisibilityOfElement(driver, CARRIAGE_SCHEME, 3);
        Util.waitForVisibilityOfElement(driver, BUTTON_INPUT_PASSENGERS_DATA, 3);
        driver.findElement(BUTTON_INPUT_PASSENGERS_DATA).click();
        return this;
    }
}
//    public CarriagePage chooseTheFreeSeatBySystem() {
//        Util.waitForVisibilityOfElement(driver, BUTTON_INPUT_PASSENGERS_DATA, 3);
//        driver.findElement(BUTTON_INPUT_PASSENGERS_DATA).click();
//        return this;
//    }
//}
