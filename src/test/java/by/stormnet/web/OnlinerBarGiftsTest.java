package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarGiftsHelper;
import by.stormnet.web.helpers.OnlinerBarMobileHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarGiftsTest {
    OnlinerBarGiftsHelper onlinerBarGiftsHelper = new OnlinerBarGiftsHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarGiftsHelper.openLoginPage();
    }

    @Test
    public void checkBarGiftsTest() {
        onlinerBarGiftsHelper.clickGiftsButton().clickGiftsSection();
        Assert.assertEquals(onlinerBarGiftsHelper.getText(), "Подарки");
    }

}
