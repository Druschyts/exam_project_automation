package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerWeatherHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerWeatherTest {

    OnlinerWeatherHelper onlinerWeatherHelper = new OnlinerWeatherHelper();

    @BeforeClass
    public void setUp() {
        onlinerWeatherHelper.openLoginPage();
    }

    @Test
    public void checkWeatherTest() {
        onlinerWeatherHelper.clickWeather();
        Assert.assertEquals(onlinerWeatherHelper.getText(), "Сейчас в Минске");
    }

}
