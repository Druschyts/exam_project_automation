package by.stormnet.web.pages;

public class OnlinerTabletsPage extends AbstractPage {
    private String tabletsButton = "//li[8]//a[1]//span[1]//span[1]";
    private String checkTablets = "//h1[@class='schema-header__title']";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickTabletsButton() {
        getElement(tabletsButton).click();
        return getLoginPage();
    }

    public String checkTabletsElement() {
        waitForElementClickable(getElementBy(checkTablets));
        return getElement(checkTablets).getText();
    }
}
