package by.stormnet.web.helpers;

import by.stormnet.web.pages.LoginOnlinerPage;

public class LoginOnlinerHelper extends AbsractHelper {

    LoginOnlinerPage loginPage = new LoginOnlinerPage();

    public LoginOnlinerHelper openLoginPage() {
        loginPage.navigateToLoginPage();
        return this;
    }

    public LoginOnlinerHelper login(String username, String password) {
        loginPage.clickLoginButton()
                .fillUsernameField(username)
                .fillPasswordField(password)
                .clickLiginButtonOn();
        return this;
    }

    public boolean checkAvatarIsDisplayed() {
        return loginPage.isAvatarDisplay();
    }
}
