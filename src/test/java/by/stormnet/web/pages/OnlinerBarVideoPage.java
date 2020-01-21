package by.stormnet.web.pages;

public class OnlinerBarVideoPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String videoButton = "//div[@class='b-whbd-i']//div[1]//div[2]//ul[1]//li[9]//a[1]";
    private String videoField = "//div[@class='b-whbd-i']//div[1]//div[2]//ul[1]//li[9]//a[1]";

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

    public LoginOnlinerPage clickVideoSection() {
        getElement(videoButton).click();
        return getLoginPage();
    }

    public String videoElement() {
        waitForElementClickable(getElementBy(videoField));
        return getElement(videoField).getText();
    }
}
