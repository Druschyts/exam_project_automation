package by.stormnet.web.pages;

public class OnlinerBarRadioPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String radioButton = "//a[contains(text(),', DECT')]";
    private String radioField = "//a[contains(text(),', DECT')]";

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

    public LoginOnlinerPage clickRadioSection() {
        getElement(radioButton).click();
        return getLoginPage();
    }

    public String radioElement() {
        waitForElementClickable(getElementBy(radioField));
        return getElement(radioField).getText();
    }
}
