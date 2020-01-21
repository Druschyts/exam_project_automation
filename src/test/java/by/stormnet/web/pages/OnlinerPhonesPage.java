package by.stormnet.web.pages;

public class OnlinerPhonesPage extends AbstractPage {
    private String phonesButton = "//li[4]//a[1]//span[1]//span[1]";
    private String checkPhones = "//h1[@class='schema-header__title']";


    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickPhonesButton() {
        getElement(phonesButton).click();
        return getLoginPage();
    }

    public String checkPhonesElement() {
        waitForElementClickable(getElementBy(checkPhones));
        return getElement(checkPhones).getText();
    }

}
