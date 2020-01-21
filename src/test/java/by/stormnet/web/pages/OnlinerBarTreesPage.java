package by.stormnet.web.pages;

public class OnlinerBarTreesPage extends AbstractPage {
    private String barButton = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String treesButton = "//div[@class='b-whbd']//div[2]//div[1]//ul[1]//li[1]//a[1]";
    private String treesField = "//*[@id=\"minWidth\"]/div/div[2]/div[2]/div/div[2]/div[2]/h1/a";

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

    public LoginOnlinerPage clickTressSection() {
        getElement(treesButton).click();
        return getLoginPage();
    }

    public String treesElement() {
        waitForElementClickable(getElementBy(treesField));
        return getElement(treesField).getText();
    }
}
