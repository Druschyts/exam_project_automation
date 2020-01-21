package by.stormnet.web.pages;

import by.stormnet.web.helpers.AbsractHelper;

public class OnlinerTiresPage extends AbstractPage {
    private String tiresButton = "//li[3]//a[1]//span[1]//span[1]";
    private String checkTires = "//h1[@class='schema-header__title']";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickTiresButton() {
        getElement(tiresButton).click();
        return getLoginPage();
    }

    public String checkTiresElement() {
        waitForElementClickable(getElementBy(checkTires));
        return getElement(checkTires).getText();
    }
}
