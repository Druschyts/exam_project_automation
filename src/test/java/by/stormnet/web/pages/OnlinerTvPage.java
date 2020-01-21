package by.stormnet.web.pages;

public class OnlinerTvPage extends AbstractPage {
    private String tvButton = "//li[5]//a[1]//span[1]//span[1]";
    private String checkTv = "//h1[@class='schema-header__title']";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickTvButton() {
        getElement(tvButton).click();
        return getLoginPage();
    }

    public String checkTvElement() {
        waitForElementClickable(getElementBy(checkTv));
        return getElement(checkTv).getText();
    }
}
