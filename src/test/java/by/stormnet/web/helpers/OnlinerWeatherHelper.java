package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerWeatherPage;

public class OnlinerWeatherHelper extends AbsractHelper {

    OnlinerWeatherPage onlinerWeatherPage = new OnlinerWeatherPage();

    public OnlinerWeatherHelper openLoginPage() {
        onlinerWeatherPage.navigateToLoginPage();
        return this;
    }

    public OnlinerWeatherHelper clickWeather() {
        onlinerWeatherPage.clickWeatherButton();
        return this;
    }
    public String getText() {
        return onlinerWeatherPage.checkWeatherElement();
    }
}
