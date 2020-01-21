package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerCamerasHelper;
import by.stormnet.web.helpers.OnlinerTvHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerCamerasTest {
    OnlinerCamerasHelper onlinerCamerasHelper = new OnlinerCamerasHelper();

    @BeforeClass
    public void setUp() {
        onlinerCamerasHelper.openLoginPage();
    }

    @Test
    public void checkCamerasTest() {
        onlinerCamerasHelper.clickCameras();
        Assert.assertEquals(onlinerCamerasHelper.getText(), "Фотоаппараты");
    }

}
