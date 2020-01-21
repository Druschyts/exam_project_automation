package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerTvHelper;
import by.stormnet.web.helpers.OnlinerWeatherHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerTvTest {
    OnlinerTvHelper onlinerTvHelper = new OnlinerTvHelper();

    @BeforeClass
    public void setUp() {
        onlinerTvHelper.openLoginPage();
    }

    @Test
    public void checkTvTest() {
        onlinerTvHelper.clickTv();
        Assert.assertEquals(onlinerTvHelper.getText(), "Телевизоры");
    }

}
