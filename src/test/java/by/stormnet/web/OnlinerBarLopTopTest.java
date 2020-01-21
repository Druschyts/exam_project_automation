package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarLopTopHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarLopTopTest {
    OnlinerBarLopTopHelper onlinerBarLopTopHelper = new OnlinerBarLopTopHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarLopTopHelper.openLoginPage();
    }

    @Test
    public void checkBarLopTopTest() {
        onlinerBarLopTopHelper.clickBaraButton().clickLopTopSection();
        Assert.assertEquals(onlinerBarLopTopHelper.getText(), "Ноутбуки");
    }
}
