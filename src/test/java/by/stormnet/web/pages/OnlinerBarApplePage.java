package by.stormnet.web.pages;

public class OnlinerBarApplePage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String applecButton = "//a[contains(text(),'Apple. Mac. iPod. iPhone. iPad')]";
    private String appleField = "//a[contains(text(),'Apple. Mac. iPod. iPhone. iPad.')]";

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

    public LoginOnlinerPage clickAppleSection() {
        getElement(applecButton).click();
        return getLoginPage();
    }

    public String appleElement() {
        waitForElementClickable(getElementBy(appleField));
        return getElement(appleField).getText();
    }
}
