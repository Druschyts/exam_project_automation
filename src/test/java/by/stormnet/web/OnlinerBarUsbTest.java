package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarRadioHelper;
import by.stormnet.web.helpers.OnlinerBarUsbHelper;
import by.stormnet.web.pages.OnlinerBarUsbPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarUsbTest {
    OnlinerBarUsbHelper onlinerBarUsbHelper = new OnlinerBarUsbHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarUsbHelper.openLoginPage();
    }

    @Test
    public void checkDarUsbTest() {
        onlinerBarUsbHelper.clickUsbButton().clickUsbSection();
        Assert.assertEquals(onlinerBarUsbHelper.getText(), "USB-флешки. HDD. SSD. Чистые CD/DVD/Blu-ray диски и приводы");
    }

}
