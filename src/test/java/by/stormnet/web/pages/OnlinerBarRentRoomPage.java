package by.stormnet.web.pages;

public class OnlinerBarRentRoomPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String rentRoom = "//div[@class='b-whbd']//div[2]//div[2]//ul[1]//li[2]//a[1]";
    private String rentRoomField = "//li[@class='project-navigation__item project-navigation__item_primary project-navigation__item_active']//span[@class='project-navigation__sign']";

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

    public LoginOnlinerPage clickRentRoomSection() {
        getElement(rentRoom).click();
        return getLoginPage();
    }

    public String rentRoomElement() {
        waitForElementClickable(getElementBy(rentRoomField));
        return getElement(rentRoomField).getText();
    }
}
