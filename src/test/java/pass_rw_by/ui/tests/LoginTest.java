package pass_rw_by.ui.tests;

import pass_rw_by.ui.data.UserData;
import pass_rw_by.ui.pages.AuthorPage;
import pass_rw_by.ui.set.Util;
import pass_rw_by.ui.steps.AuthorizationStep;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    @Test
    @DisplayName("Авторизация с валидными данными")
    public void testLoginPassRWby() {
        AuthorizationStep.openLoginForm();
        AuthorizationStep.fillLoginForm(UserData.USER_LOGIN, UserData.USER_PASSWORD);
        Assert.assertTrue(driver.findElement(By.xpath(AuthorPage.ICON_PROFILE_ACTIVE)).isDisplayed());
    }
    @Test
    @DisplayName("Авторизация без пароля")
    public void testLoginPassRWbyWithEmptyPasswordForm() {
        AuthorizationStep.openLoginForm();
        AuthorizationStep.fillLoginForm(UserData.USER_LOGIN, UserData.EMPTY_PASSWORD);
        Assert.assertTrue(driver.findElement(By.xpath(AuthorPage.PASSWORD_ERROR_MESSAGE)).isDisplayed());
    }
    @Test
    @DisplayName("Авторизация с пустыми полями")
    public void testLoginPassRWbyWithEmptyForms() {
        AuthorizationStep.openLoginForm();
        AuthorizationStep.fillLoginForm(UserData.EMPTY_LOGIN, UserData.EMPTY_PASSWORD);
        Assert.assertTrue(driver.findElement(By.xpath(AuthorPage.LOGIN_ERROR_MESSAGE)).isDisplayed());
    }
    @Test
    @DisplayName("Авторизация со случайными данными")
    public void testLoginPassRWbyWithRandom() {
        AuthorizationStep.openLoginForm();
        AuthorizationStep.fillLoginForm(UserData.RANDOM_EMAIL, UserData.RANDOM_PASSWORD);
        Util.waitForVisibilityOfElement(driver, AuthorPage.USER_ERROR_MESSAGE, 3);
        Assert.assertTrue(driver.findElement(AuthorPage.USER_ERROR_MESSAGE).isDisplayed());
        Assert.assertEquals(AuthorPage.USER_ERROR_MESSAGE_TEXT, driver.findElement(AuthorPage.USER_ERROR_MESSAGE).getText());

    }
}