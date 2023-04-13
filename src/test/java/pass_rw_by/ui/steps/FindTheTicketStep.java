package pass_rw_by.ui.steps;

import pass_rw_by.ui.pages.CarriagePage;
import pass_rw_by.ui.pages.TrainsPage;
import pass_rw_by.ui.pages.WayPage;

public class FindTheTicketStep {
    public static void findOneWayTicket(String From, String To, int date) {
        new WayPage()
                .wayFrom(From)
                .wayTo(To)
                .chooseTheDate(date)
                .btnFindTheTrain();
        new TrainsPage()
                .chooseTheFirstTrain();
        new CarriagePage()
                .chooseTheFirstFreeCarriage()
                .chooseTheSeatBySystem();
    }
}