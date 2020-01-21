package by.stormnet.web.pages;

public class LoginOnlinerPage extends AbstractPage {
    private String usernameField = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input";
    private String passwordField = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div/div/input";
    private String ButtonLogin = "//div[@class='auth-bar__item auth-bar__item--text']";
    private String LogIn = "//button[@class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']";
    private String avatar = "//div[@class='b-top-profile__image js-header-user-avatar']";


    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        waitForElementVisible(getElementBy(usernameField));
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickLoginButton() {
        getElement(ButtonLogin).click();
        return getLoginPage();
    }

    public LoginOnlinerPage fillUsernameField(String username) {
        getElement(usernameField).sendKeys(username);
        return getLoginPage();
    }

    public LoginOnlinerPage fillPasswordField(String password) {
        getElement(passwordField).sendKeys(password);
        return getLoginPage();
    }

    public LoginOnlinerPage clickLiginButtonOn() {
        getElement(LogIn).click();
        return getLoginPage();
    }


    public boolean isAvatarDisplay() {
        waitForElementClickable(getElementBy(avatar));
        return getElement(avatar).isDisplayed();
    }
}
