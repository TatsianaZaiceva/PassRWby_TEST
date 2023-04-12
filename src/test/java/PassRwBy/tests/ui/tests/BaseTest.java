package PassRwBy.tests.ui.tests;

import PassRwBy.tests.ui.set.DriverSet;
import PassRwBy.tests.ui.pages.AuthorPage;
import PassRwBy.tests.ui.pages.MainPage;
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
