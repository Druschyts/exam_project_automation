package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarMobileHelper;
import by.stormnet.web.helpers.OnlinerPhonesHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarMobileTest {
    OnlinerBarMobileHelper onlinerBarMobileHelper = new OnlinerBarMobileHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarMobileHelper.openLoginPage();
    }

    @Test
    public void checkBarMobileTest() {
        onlinerBarMobileHelper.clickMobileButton().clickMobileSection();
        Assert.assertEquals(onlinerBarMobileHelper.getText(), "Мобильные телефоны");
    }

}
