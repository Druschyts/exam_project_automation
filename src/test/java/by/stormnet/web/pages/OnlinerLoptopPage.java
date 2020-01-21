package by.stormnet.web.pages;

public class OnlinerLoptopPage extends AbstractPage {
    private String clickLoptopButton = "//li[2]//a[1]//span[1]//span[1]";
    private String checkpage = "//h1[@class='schema-header__title']";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickLoptopButton() {
        getElement(clickLoptopButton).click();
        return getLoginPage();
    }

    public String checkLoptopButton() {
        waitForElementClickable(getElementBy(checkpage));
        return getElement(checkpage).getText();
    }
}
