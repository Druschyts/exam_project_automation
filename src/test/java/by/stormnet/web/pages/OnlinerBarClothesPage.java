package by.stormnet.web.pages;

public class OnlinerBarClothesPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String clothesButton = "//div[@class='b-cm-col']//div[1]//ul[1]//li[5]//a[1]";
    private String clothesField = "//h1[contains(@class,'m-title-i')]//a";

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

    public LoginOnlinerPage clickClothesSection() {
        getElement(clothesButton).click();
        return getLoginPage();
    }

    public String clothesElement() {
        waitForElementClickable(getElementBy(clothesField));
        return getElement(clothesField).getText();
    }
}
