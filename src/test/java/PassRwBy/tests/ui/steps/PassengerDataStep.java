package PassRwBy.tests.ui.steps;

import PassRwBy.tests.ui.pages.PassengersPage;
import PassRwBy.tests.ui.set.Util;

import static PassRwBy.tests.ui.set.DriverSet.driver;

public class PassengerDataStep {
    public static void fillThePassengerForm(String LastName, String FirstName, String MiddleName, String Passport) {
        new PassengersPage()
                .inputLastName(LastName)
                .inputFirstName(FirstName)
                .inputMiddleName(MiddleName)
                .inputDocumentNumber(Passport)
                .cLickCheckout();
    }
}
