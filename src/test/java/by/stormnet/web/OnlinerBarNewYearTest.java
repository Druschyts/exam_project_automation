package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarNewYearHelper;
import by.stormnet.web.helpers.OnlinerBarSaleRoomHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarNewYearTest {
    OnlinerBarNewYearHelper onlinerBarNewYearHelper = new OnlinerBarNewYearHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarNewYearHelper.openLoginPage();
    }

    @Test
    public void checkBarNewYearTest() {
        onlinerBarNewYearHelper.clickNewYearButton().clickNewYearSection();
        Assert.assertEquals(onlinerBarNewYearHelper.getText(), "Услуги к Новому году");
    }

}
