package by.stormnet.web.pages;

public class OnlinerBarUsbPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String usbButton = "//a[contains(text(),'CD/DVD/Blu-ray')]";
    private String usbField = "//a[contains(text(),'CD/DVD/Blu-ray')]";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickBarButton() {
        getElement(barButton).click();
        return getLoginPage();
    }

    public LoginOnlinerPage clickUsbSection() {
        getElement(usbButton).click();
        return getLoginPage();
    }

    public String usbElement() {
        waitForElementClickable(getElementBy(usbField));
        return getElement(usbField).getText();
    }
}
