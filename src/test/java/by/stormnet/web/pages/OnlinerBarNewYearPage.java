package by.stormnet.web.pages;

public class OnlinerBarNewYearPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String newYearButton = "//div[@class='b-whbd']//div[2]//div[1]//ul[1]//li[2]//a[1]";
    private String newYearField = "//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[2]/div[2]/h1/a";

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

    public LoginOnlinerPage clickNewYearSection() {
        getElement(newYearButton).click();
        return getLoginPage();
    }

    public String newYearElement() {
        waitForElementClickable(getElementBy(newYearField));
        return getElement(newYearField).getText();
    }
}
