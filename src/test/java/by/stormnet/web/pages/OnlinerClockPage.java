package by.stormnet.web.pages;

public class OnlinerClockPage extends AbstractPage {
    private String clockButton = "//li[6]//a[1]//span[1]//span[1]";
    private String checkClock = "//h1[@class='schema-header__title']";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickClockButton() {
        getElement(clockButton).click();
        return getLoginPage();
    }

    public String checkClockElement() {
        waitForElementClickable(getElementBy(checkClock));
        return getElement(checkClock).getText();
    }
}
