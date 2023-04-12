package PassRwBy.tests.ui.steps;

import PassRwBy.tests.ui.pages.*;

public class FindTheTicketStep {
    public static void findOneWayTicket(String From, String To, int date) {
        new WayPage()
                .wayFrom(From)
                .wayTo(To)
                .chooseTheDate(date)
                //забрать данные для проверки в корзине
                .btnFindTheTrain();
        new TrainsPage()
                .chooseTheFirstTrain();
        new CarriagePage()
                .chooseTheFirstFreeCarriage()
                .chooseTheFirstFreeSeat();
    }
    public static void backToCarriage() {
        new CarriagePage()
                .chooseTheFirstFreeCarriage()
                .chooseTheFirstFreeSeat();
    }
}