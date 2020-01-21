package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarMobileHelper;
import by.stormnet.web.helpers.OnlinerBarRadioHelper;
import by.stormnet.web.pages.OnlinerBarRadioPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarRadioTest {
    OnlinerBarRadioHelper onlinerBarRadioHelper = new OnlinerBarRadioHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarRadioHelper.openLoginPage();
    }

    @Test
    public void checkBarRadioTest() {
        onlinerBarRadioHelper.clickRadioButton().clickRadioSection();
        Assert.assertEquals(onlinerBarRadioHelper.getText(), "Радиотелефоны, DECT и Проводные телефоны.");
    }

}
