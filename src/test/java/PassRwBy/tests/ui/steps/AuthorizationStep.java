package PassRwBy.tests.ui.steps;

import PassRwBy.tests.ui.pages.AuthorPage;
import PassRwBy.tests.ui.pages.MainPage;

public class AuthorizationStep {
    public static void openLoginForm() {
        new MainPage()
                .openLoginForm();
    }
    public static void fillLoginForm(String name, String password){
        new AuthorPage()
                .inputLogin(name)
                .inputPassword(password)
                .cLickTheButtonLogin();
    }
}
