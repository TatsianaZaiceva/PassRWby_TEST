package PassRwBy.tests.ui.tests;

import PassRwBy.tests.ui.data.UserData;
import PassRwBy.tests.ui.pages.WayPage;
import PassRwBy.tests.ui.steps.AuthorizationStep;
import PassRwBy.tests.ui.steps.FindTheTicketStep;
import PassRwBy.tests.ui.steps.PassengerDataStep;
import org.junit.Assert;
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
//      Assert.
    }
    @Test
    @DisplayName("Выбор билета без авторизации")
    public void testOneWayTicketWithoutAuthorization() {
        FindTheTicketStep.findOneWayTicket(WayPage.FROM, WayPage.TO, WayPage.DATE);
        AuthorizationStep.fillLoginForm(UserData.USER_LOGIN, UserData.USER_PASSWORD);
        FindTheTicketStep.backToCarriage();
//        PassengerDataStep.fillThePassengerForm(UserData.USER_LAST_NAME, UserData.USER_FIRST_NAME,
//                UserData.USER_MIDDLE_NAME, UserData.USER_DOCUMENT);
//        Assert.
    }
}

