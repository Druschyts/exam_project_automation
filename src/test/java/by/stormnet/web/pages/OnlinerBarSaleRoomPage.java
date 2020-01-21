package by.stormnet.web.pages;

public class OnlinerBarSaleRoomPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String saleRoom = "//div[@class='b-whbd']//div[2]//div[2]//ul[1]//li[1]//a[1]";
    private String saleRoomField = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[1]/a/span/span";

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

    public LoginOnlinerPage clickSaleRoomSection() {
        getElement(saleRoom).click();
        return getLoginPage();
    }

    public String saleRoomElement() {
        waitForElementClickable(getElementBy(saleRoomField));
        return getElement(saleRoomField).getText();
    }
}
