package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerCheckCartHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerCheckCartTest {

    private OnlinerCheckCartHelper onCart = new OnlinerCheckCartHelper();

    @BeforeClass
    public void setUp() {
        onCart.openLoginPage();
    }

    @Test
    public void checkCartTest() throws InterruptedException {
        onCart.checkCart();
        Assert.assertEquals(onCart.getText(),"Корзина");
    }

}

