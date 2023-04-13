package pass_rw_by.ui.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import pass_rw_by.ui.pages.AuthorPage;
import pass_rw_by.ui.pages.CartPage;
import pass_rw_by.ui.steps.FindTheTicketStep;
import pass_rw_by.ui.data.UserData;
import pass_rw_by.ui.pages.WayPage;
import pass_rw_by.ui.steps.AuthorizationStep;
import pass_rw_by.ui.steps.PassengerDataStep;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OneWayTicketTest extends BaseTest {
    @Test
    @DisplayName("Выбор билета с авторизацией")
    public void testOneWayTicket() {
        AuthorizationStep.openLoginForm();
        AuthorizationStep.fillLoginForm(UserData.USER_LOGIN, UserData.USER_PASSWORD);
        FindTheTicketStep.findOneWayTicket(WayPage.FROM, WayPage.TO, WayPage.DATE);
        PassengerDataStep.fillThePassengerForm(UserData.USER_LAST_NAME, UserData.USER_FIRST_NAME,
                                                UserData.USER_MIDDLE_NAME, UserData.USER_DOCUMENT);
        Assert.assertTrue(driver.findElement(CartPage.ORDER_IN_CART).isDisplayed());
    }
    @Test
    @DisplayName("Авторизация после выбора билета")
    public void testNeededAuthorizationToBuyOneWayTicket() {
        FindTheTicketStep.findOneWayTicket(WayPage.FROM, WayPage.TO, WayPage.DATE);
        AuthorizationStep.fillLoginForm(UserData.USER_LOGIN, UserData.USER_PASSWORD);
        Assert.assertTrue(driver.findElement(By.xpath(AuthorPage.ICON_PROFILE_ACTIVE)).isDisplayed());
    }
}

