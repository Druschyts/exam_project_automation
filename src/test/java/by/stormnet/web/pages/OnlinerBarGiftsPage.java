package by.stormnet.web.pages;

public class OnlinerBarGiftsPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String giftsButton = "//div[@class='b-whbd']//div[2]//div[1]//ul[1]//li[3]//a[1]";
    private String giftsField = "//h1[contains(@class,'m-title-i')]//a";

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

    public LoginOnlinerPage clickGiftsSection() {
        getElement(giftsButton).click();
        return getLoginPage();
    }

    public String giftsElement() {
        waitForElementClickable(getElementBy(giftsField));
        return getElement(giftsField).getText();
    }
}
