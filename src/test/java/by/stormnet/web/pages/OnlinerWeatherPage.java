package by.stormnet.web.pages;

public class OnlinerWeatherPage extends AbstractPage {
    private String weatherButton = "//*[@id=\"weather-informer\"]/a/span";
    private String checkWeather = "//div[@class='b-weather-today__city-i']//p";

    public LoginOnlinerPage getLoginPage() {
        LoginOnlinerPage loginPage = new LoginOnlinerPage();
        return loginPage;
    }

    public LoginOnlinerPage navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();
    }

    public LoginOnlinerPage clickWeatherButton() {
        getElement(weatherButton).click();
        return getLoginPage();
    }

    public String checkWeatherElement() {
        waitForElementClickable(getElementBy(checkWeather));
        return getElement(checkWeather).getText();
    }
}
