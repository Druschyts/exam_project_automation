package by.stormnet.web.pages;

public class OnlinerBarMobileServicesPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String mobileServicesButton = "//div[@class='b-columntopic columntopic-bah']//div[1]//div[1]//ul[1]//li[3]//a[1]";
    private String mobileServicesField = "//h1[contains(@class,'m-title-i')]//a[contains(text(),':')]";

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

    public LoginOnlinerPage clickMobileServicesSection() {
        getElement(mobileServicesButton).click();
        return getLoginPage();
    }

    public String mobileServicesElement() {
        waitForElementClickable(getElementBy(mobileServicesField));
        return getElement(mobileServicesField).getText();
    }
}
