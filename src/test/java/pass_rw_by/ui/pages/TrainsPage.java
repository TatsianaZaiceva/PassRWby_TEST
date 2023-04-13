package pass_rw_by.ui.pages;

import org.openqa.selenium.By;

import static pass_rw_by.ui.set.DriverSet.driver;

public class TrainsPage {
    public static final String BUTTON_CHOOSE_THE_TRAIN = "//a[@class='btn btn-index']";
    public TrainsPage chooseTheFirstTrain(){
        driver.findElement(By.xpath(BUTTON_CHOOSE_THE_TRAIN)).click();
        return this;
    }
}
