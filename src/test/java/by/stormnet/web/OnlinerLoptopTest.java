package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerLoptopHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerLoptopTest {
    OnlinerLoptopHelper onlinerLoptopHelper = new OnlinerLoptopHelper();

    @BeforeClass
    public void setUp() {
        onlinerLoptopHelper.openLoginPage();
    }

    @Test
    public void checkLoptopTest() {
        onlinerLoptopHelper.clickLoptopButton();
        Assert.assertEquals(onlinerLoptopHelper.getText(), "Ноутбуки");
    }

}

