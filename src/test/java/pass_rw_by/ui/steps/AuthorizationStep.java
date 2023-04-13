package pass_rw_by.ui.steps;

import pass_rw_by.ui.pages.AuthorPage;
import pass_rw_by.ui.pages.MainPage;

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
