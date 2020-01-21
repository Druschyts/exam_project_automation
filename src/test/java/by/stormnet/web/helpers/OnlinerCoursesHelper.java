package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerCoursesPage;
import by.stormnet.web.pages.OnlinerWeatherPage;

public class OnlinerCoursesHelper extends AbsractHelper {
    OnlinerCoursesPage onlinerCoursesPage = new OnlinerCoursesPage();

    public OnlinerCoursesHelper openLoginPage() {
        onlinerCoursesPage.navigateToLoginPage();
        return this;
    }

    public OnlinerCoursesHelper clickWeather() {
        onlinerCoursesPage.clickWeatherButton();
        return this;
    }

    public String getText() {
        return onlinerCoursesPage.checkWeatherElement();
    }
}
