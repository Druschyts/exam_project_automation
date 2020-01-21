package by.stormnet.web.pages;

public class OnlinerCamerasPage extends AbstractPage {
    private String camerasButton = "//li[9]//a[1]//span[1]//span[1]";
    private String checkCameras = "//h1[@class='schema-header__title']";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickCamerasButton() {
        getElement(camerasButton).click();
        return getLoginPage();
    }

    public String camerasElement() {
        waitForElementClickable(getElementBy(checkCameras));
        return getElement(checkCameras).getText();
    }
}
