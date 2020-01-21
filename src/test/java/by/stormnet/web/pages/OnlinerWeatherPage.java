package by.stormnet.web.pages;

public class OnlinerWeatherPage extends AbstractPage {
    private String weatherButton = "//i[@class='phenomena-icon extra-small A10']";
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
