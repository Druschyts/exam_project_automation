package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerTiresHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerTiresTest {
    OnlinerTiresHelper onlinerTiresHelper = new OnlinerTiresHelper();

    @BeforeClass
    public void setUp() {
        onlinerTiresHelper.openLoginPage();
    }

    @Test
    public void checkTiresTest() {
        onlinerTiresHelper.clickTires();
        Assert.assertEquals(onlinerTiresHelper.getText(), "Автомобильные шины");
    }

}

