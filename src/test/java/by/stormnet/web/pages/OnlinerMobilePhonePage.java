package by.stormnet.web.pages;

public class OnlinerMobilePhonePage extends AbstractPage {
    private String clickMobileButton = "//ul[2]//li[1]//a[1]//span[1]//span[1]";
    private String checkpage = "//h1[@class='schema-header__title']";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickMobilePhoneButton() {
        getElement(clickMobileButton).click();
        return getLoginPage();
    }

    public String checkMobilePhoneButton() {
        waitForElementClickable(getElementBy(checkpage));
        return getElement(checkpage).getText();
    }
}
