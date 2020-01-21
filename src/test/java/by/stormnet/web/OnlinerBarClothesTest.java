package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarClothesHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarClothesTest {
    OnlinerBarClothesHelper onlinerBarClothesHelper = new OnlinerBarClothesHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarClothesHelper.openLoginPage();
    }

    @Test
    public void checkBarClothesTest() {
        onlinerBarClothesHelper.clickClothesButton().clickClothesSection();
        Assert.assertEquals(onlinerBarClothesHelper.getText(), "Карнавальные костюмы для взрослых");
    }

}
