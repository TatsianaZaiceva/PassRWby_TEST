package pass_rw_by.ui.steps;

import pass_rw_by.ui.pages.PassengersPage;

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
