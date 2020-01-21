package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerBarRentRoomHelper;
import by.stormnet.web.helpers.OnlinerBarTreesHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerBarTreesTest {
    OnlinerBarTreesHelper onlinerBarTreesHelper = new OnlinerBarTreesHelper();

    @BeforeClass
    public void setUp() {
        onlinerBarTreesHelper.openLoginPage();
    }

    @Test
    public void checkBarTreesTest() {
        onlinerBarTreesHelper.clickTressButton().clickTreesSection();
        Assert.assertEquals(onlinerBarTreesHelper.getText(), "Ёлки");
    }

}
