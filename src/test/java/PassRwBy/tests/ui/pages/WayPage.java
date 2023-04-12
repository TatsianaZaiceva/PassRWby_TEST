package PassRwBy.tests.ui.pages;

import org.openqa.selenium.By;

import static PassRwBy.tests.ui.set.DriverSet.driver;

public class WayPage {
    public static final String FROM = "Гомель";
    public static final String TO = "Минск-Пассажирский";
    public static final int DATE = 6;
    public static final String INPUT_FORM_FROM = "//input[@id='one-way-raspFormFromTitle']";
    public static final String INPUT_FORM_TO = "//input[@id='one-way-raspFormToTitle']";
    public static final String INPUT_FORM_DATE = "//*[@id='filter-tab_2-1']//div[@class='rasp-form__inp input-group date']";
    public static final String SELECT_THE_DAY = "//td[@data-handler='selectDay']";
    public static final String BUTTON_SEARCH_THE_TRAINS = "//button[@class='btn btn-default btn-submit js-input-taber']";
    public WayPage wayFrom(String WayFrom) {
        driver.findElement(By.xpath(INPUT_FORM_FROM)).sendKeys(WayFrom);
        return this;
    }
    public WayPage wayTo(String WayTo) {
        driver.findElement(By.xpath(INPUT_FORM_TO)).sendKeys(WayTo);
        return this;
    }
    public WayPage chooseTheDate(int theDayFromToday) {
        driver.findElement(By.xpath(INPUT_FORM_DATE)).click();
        driver.findElements(By.xpath(SELECT_THE_DAY)).get(theDayFromToday).click();
        return this;
    }
    public WayPage btnFindTheTrain() {
        driver.findElement(By.xpath(BUTTON_SEARCH_THE_TRAINS)).click();
        return this;
    }
}
