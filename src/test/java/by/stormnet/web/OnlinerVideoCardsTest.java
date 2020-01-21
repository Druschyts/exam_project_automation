package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerTvHelper;
import by.stormnet.web.helpers.OnlinerVideoCardsHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerVideoCardsTest {
    OnlinerVideoCardsHelper onlinerVideoCardsHelper = new OnlinerVideoCardsHelper();

    @BeforeClass
    public void setUp() {
        onlinerVideoCardsHelper.openLoginPage();
    }

    @Test
    public void checkVideoCardsTest() {
        onlinerVideoCardsHelper.clickVideoCards();
        Assert.assertEquals(onlinerVideoCardsHelper.getText(), "Видеокарты");
    }

}

