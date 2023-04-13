package pass_rw_by.ui.tests;

import pass_rw_by.ui.set.DriverSet;
import pass_rw_by.ui.pages.AuthorPage;
import pass_rw_by.ui.pages.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest extends DriverSet {
    @BeforeEach
    public void openTest() {
        DriverSet.createDriver().get(AuthorPage.URL);
        new MainPage().closePopupNotification();
    }
    @AfterEach
    public void closeTest() {
        DriverSet.closeDriver();
    }
}
