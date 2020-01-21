package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarMobileAccHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarMobileAccTest {
    OnlinerBarMobileAccHelper onlinerBarMobileAccHelper = new OnlinerBarMobileAccHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarMobileAccHelper.openLoginPage();
    }

    @Test
    public void checkBarMobileAccTest() {
        onlinerBarMobileAccHelper.clickMobileAccButton().clickMobileAccSection();
        Assert.assertEquals(onlinerBarMobileAccHelper.getText(), "Мобильные телефоны: аксессуары и запчасти");
    }

}
