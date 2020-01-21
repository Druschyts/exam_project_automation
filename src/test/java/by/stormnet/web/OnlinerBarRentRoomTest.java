package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarGiftsHelper;
import by.stormnet.web.helpers.OnlinerBarRentRoomHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarRentRoomTest {
    OnlinerBarRentRoomHelper onlinerBarRentRoomHelper = new OnlinerBarRentRoomHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarRentRoomHelper.openLoginPage();
    }

    @Test
    public void checkBarRentRoomTest() {
        onlinerBarRentRoomHelper.clickRentRoomButton().clickRentRoomSection();
        Assert.assertEquals(onlinerBarRentRoomHelper.getText(), "Аренда");
    }

}
