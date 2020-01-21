package by.stormnet.web.helpers;


import by.stormnet.web.pages.OnlinerCheckCartPage;

public class OnlinerCheckCartHelper extends AbsractHelper {

    OnlinerCheckCartPage onlinerCheckCart = new OnlinerCheckCartPage();

    public OnlinerCheckCartHelper openLoginPage() {
        onlinerCheckCart.navigateToLoginPage();
        return this;
    }

    public OnlinerCheckCartHelper checkCart() throws InterruptedException {
        onlinerCheckCart.clickAvatar();
        Thread.sleep(1000);
        onlinerCheckCart.clickcartButton();
        return this;
    }

    public String getText() {
        return onlinerCheckCart.checkCartElement();
    }
}

