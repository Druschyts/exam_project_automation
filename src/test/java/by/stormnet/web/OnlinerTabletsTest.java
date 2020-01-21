package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerTabletsHelper;
import by.stormnet.web.helpers.OnlinerTiresHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerTabletsTest {
    OnlinerTabletsHelper onlinerTabletsHelper = new OnlinerTabletsHelper();

    @BeforeClass
    public void setUp() {
        onlinerTabletsHelper.openLoginPage();
    }

    @Test
    public void checkTabletsTest() {
        onlinerTabletsHelper.clickTires();
        Assert.assertEquals(onlinerTabletsHelper.getText(), "Планшеты");
    }

}
