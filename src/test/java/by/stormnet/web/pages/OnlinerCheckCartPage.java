package by.stormnet.web.pages;

public class OnlinerCheckCartPage extends AbstractPage {

    private String buttonLog = "//a[@class='b-top-profile__preview js-toggle-bar']";
    private String cartButton = "//*[@id=\"userbar\"]/div[1]/div[1]/div/div[2]/div/div[1]/div[1]/a";
    private String cartText = "//div[@class='cart-form__title cart-form__title_big-alter']";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickAvatar() {
        getElement(buttonLog).click();
        return getLoginPage();
    }

    public LoginOnlinerPage clickcartButton() {
        getElement(cartButton).click();
        return getLoginPage();
    }

    public String checkCartElement() {
        waitForElementClickable(getElementBy(cartText));
        return getElement(cartText).getText();
    }

}
