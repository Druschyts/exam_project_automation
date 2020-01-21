package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerMobilePhoneHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerMobilePhoneTest {
    OnlinerMobilePhoneHelper onlinerMobilePhoneHelper = new OnlinerMobilePhoneHelper();
    @BeforeClass
    public void setUp() {
        onlinerMobilePhoneHelper.openLoginPage();
    }

    @Test
    public void checkMobilePhoneTest() {
        onlinerMobilePhoneHelper.clickMobilePhone();
        Assert.assertEquals(onlinerMobilePhoneHelper.getText(), "Мобильные телефоны");
    }
}
