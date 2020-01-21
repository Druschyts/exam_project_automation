package by.stormnet.web.pages;

public class OnlinerVideoCardsPage extends AbstractPage {
    private String videoCardsButton = "//li[7]//a[1]//span[1]//span[1]";
    private String checkVideoCards = "//h1[@class='schema-header__title']";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickVideoCardsButton() {
        getElement(videoCardsButton).click();
        return getLoginPage();
    }

    public String checkVideoCardsElement() {
        waitForElementClickable(getElementBy(checkVideoCards));
        return getElement(checkVideoCards).getText();
    }
}
