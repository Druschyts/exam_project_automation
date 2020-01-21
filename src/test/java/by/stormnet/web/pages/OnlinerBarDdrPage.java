package by.stormnet.web.pages;

public class OnlinerBarDdrPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String ddrButton = "//div[@class='b-whbd-i']//div[1]//div[2]//ul[1]//li[8]//a[1]";
    private String ddrField = "//h1[contains(@class,'m-title-i')]//a[contains(text(),'.')]";

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

    public LoginOnlinerPage clickDdrSection() {
        getElement(ddrButton).click();
        return getLoginPage();
    }

    public String ddrElement() {
        waitForElementClickable(getElementBy(ddrField));
        return getElement(ddrField).getText();
    }
}
