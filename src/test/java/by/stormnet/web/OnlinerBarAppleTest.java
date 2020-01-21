package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarAppleHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarAppleTest {
    OnlinerBarAppleHelper onlinerBarAppleHelper = new OnlinerBarAppleHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarAppleHelper.openLoginPage();
    }

    @Test
    public void checkBarAppleTest() {
        onlinerBarAppleHelper.clickAppButton().clickAppSection();
        Assert.assertEquals(onlinerBarAppleHelper.getText(), "Apple. Mac. iPod. iPhone. iPad.");
    }

}
