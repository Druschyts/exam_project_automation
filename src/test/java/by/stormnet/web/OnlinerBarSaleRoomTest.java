package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarMobileHelper;
import by.stormnet.web.helpers.OnlinerBarSaleRoomHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarSaleRoomTest {
    OnlinerBarSaleRoomHelper onlinerBarSaleRoomHelper = new OnlinerBarSaleRoomHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarSaleRoomHelper.openLoginPage();
    }

    @Test
    public void checkBarSaleRoomTest() {
        onlinerBarSaleRoomHelper.clickSaleRoomButton().clickSaleRoomSection();
        Assert.assertEquals(onlinerBarSaleRoomHelper.getText(), "Продажа");
    }

}
