package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarMobileServicesHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarMobileServicesTest {
    OnlinerBarMobileServicesHelper onlinerBarMobileServicesHelper = new OnlinerBarMobileServicesHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarMobileServicesHelper.openLoginPage();
    }

    @Test
    public void checkBarMobileServicesTest() {
        onlinerBarMobileServicesHelper.clickMobileButton().clickMobileServicesSection();
        Assert.assertEquals(onlinerBarMobileServicesHelper.getText(), "Мобильные телефоны: ремонт и другие услуги");
    }

}
