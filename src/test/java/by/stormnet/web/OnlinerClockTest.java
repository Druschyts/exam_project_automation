package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerClockHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerClockTest {
    OnlinerClockHelper onlinerClockHelper = new OnlinerClockHelper();

    @BeforeClass
    public void setUp() {
        onlinerClockHelper.openLoginPage();
    }

    @Test
    public void checkClockest() {
        onlinerClockHelper.clickClock();
        Assert.assertEquals(onlinerClockHelper.getText(), "Умные часы и браслеты");
    }
}
