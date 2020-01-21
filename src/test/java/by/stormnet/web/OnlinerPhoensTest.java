package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerPhonesHelper;
import by.stormnet.web.helpers.OnlinerTiresHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerPhoensTest {
    OnlinerPhonesHelper onlinerPhonesHelper = new OnlinerPhonesHelper();

    @BeforeClass
    public void setUp() {
        onlinerPhonesHelper.openLoginPage();
    }

    @Test
    public void checkPhonesTest() {
        onlinerPhonesHelper.clickTires();
        Assert.assertEquals(onlinerPhonesHelper.getText(), "Наушники и гарнитуры");
    }

}
