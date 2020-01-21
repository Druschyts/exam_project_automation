package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarMobileAccHelper;
import by.stormnet.web.helpers.OnlinerBarVideoHelper;
import by.stormnet.web.pages.OnlinerBarVideoPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarVideoTest {
    OnlinerBarVideoHelper onlinerBarVideoHelper = new OnlinerBarVideoHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarVideoHelper.openLoginPage();
    }

    @Test
    public void checkBarVideoTest() {
        onlinerBarVideoHelper.clickVideoButton().clickVideoSection();
        Assert.assertEquals(onlinerBarVideoHelper.getText(), "24");
    }

}
