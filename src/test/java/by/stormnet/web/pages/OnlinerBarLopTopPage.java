package by.stormnet.web.pages;

public class OnlinerBarLopTopPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String loptop = "//div[@class='b-columntopic columntopic-bah']//div[1]//div[2]//ul[1]//li[1]//a[1]";
    private String lopTopField = "//h1[contains(@class,'m-title-i')]//a";

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

    public LoginOnlinerPage clickLopTopSection() {
        getElement(loptop).click();
        return getLoginPage();
    }

    public String lopTopElement() {
        waitForElementClickable(getElementBy(lopTopField));
        return getElement(lopTopField).getText();
    }
}
