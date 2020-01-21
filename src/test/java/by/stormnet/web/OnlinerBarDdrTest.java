package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarDdrHelper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarDdrTest {
    OnlinerBarDdrHelper onlinerBarDdrHelper = new OnlinerBarDdrHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarDdrHelper.openLoginPage();
    }

    @Test
    public void checkBarDdrTest() {
        onlinerBarDdrHelper.clickDdrButton().clickDdrSection();
        Assert.assertEquals(onlinerBarDdrHelper.getText(), "Материнские платы. Процессоры. Оперативная память");
    }

    @AfterClass
    public void tearDown() {
        onlinerBarDdrHelper.close();
    }
}
