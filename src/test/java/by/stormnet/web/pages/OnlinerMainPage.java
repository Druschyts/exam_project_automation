package by.stormnet.web.pages;

import org.openqa.selenium.WebElement;

public class OnlinerMainPage extends AbstractPage {
    private static String section = "//h2/a[@href='https://tech.onliner.by']";
    private static String link = "//span[contains(text(), 'Ноутбуки')]";
    private String news = "//div[4]//div[1]//div[1]//section[1]//article[1]//div[1]//h2[1]//a[1]//span[1]";

    public static OnlinerMainPage getOnlinerMainPage() {
        OnlinerMainPage onMP = new OnlinerMainPage();
        waitForElementVisible(getElementBy(section));
        return onMP;
    }

    public OnlinerMainPage navigateToMainPage(){
        openUrl(baseUrl2);
        return getOnlinerMainPage();
    }

    public void clickNewsLink() {
        getElement(news).click();
    }

    public OnlinerMainPage search(){
        getElement(link).click();
        return getOnlinerMainPage();
    }

}
