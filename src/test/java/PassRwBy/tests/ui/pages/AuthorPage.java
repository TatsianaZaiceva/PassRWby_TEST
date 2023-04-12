package PassRwBy.tests.ui.pages;

import org.openqa.selenium.By;

import static PassRwBy.tests.ui.set.DriverSet.driver;

public class AuthorPage {
    public static final String URL = "https://pass.rw.by/ru";
    public static final String INPUT_LOGIN_FORM = "//input[@class='form-control']";
    public static final String INPUT_PASSWORD_FORM = "//input[@type='password']";
    public static final String BUTTON_LOGIN = "//input[@class='btn btn-index btn_submit']";
    public static final String ICON_PROFILE_ACTIVE = "//span[@class='icon profile-active']";
    public static final String LOGIN_ERROR_MESSAGE = "//label[@id='login-error']";
    public static final String LOGIN_ERROR_MESSAGE_TEXT = "Заполните поле";
    public static final String PASSWORD_ERROR_MESSAGE = "//label[@id='password-error']";
    public static final By USER_ERROR_MESSAGE = By.xpath("//div[@class='danger standalone']");
    public static final String USER_ERROR_MESSAGE_TEXT = "Пользователь не найден";
    public AuthorPage inputLogin(String UserName) {
        driver.findElement(By.xpath(INPUT_LOGIN_FORM)).sendKeys(UserName);
        return this;
    }
    public AuthorPage inputPassword(String UserPassword) {
        driver.findElement(By.xpath(INPUT_PASSWORD_FORM)).sendKeys(UserPassword);
        return this;
    }
    public AuthorPage cLickTheButtonLogin() {
        driver.findElement(By.xpath(BUTTON_LOGIN)).click();
        return this;
    }
}
