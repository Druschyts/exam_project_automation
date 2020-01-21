package by.stormnet.web.pages;

public class OnlinerCoursesPage extends AbstractPage {
    private String clickCoursesButton = "//li[@id='currency-informer']//a[@class='b-top-navigation-informers__link']";
    private String checkCourses = "//div[@class='b-currency-main__top']//h1";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }
    public LoginOnlinerPage clickWeatherButton() {
        getElement(clickCoursesButton).click();
        return getLoginPage();
    }

    public String checkWeatherElement() {
        waitForElementClickable(getElementBy(checkCourses));
        return getElement(checkCourses).getText();
    }
}
