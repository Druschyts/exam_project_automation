package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerTiresPage;

public class OnlinerTiresHelper extends AbsractHelper {
    OnlinerTiresPage onlinerTiresPage = new OnlinerTiresPage();

    public OnlinerTiresHelper openLoginPage() {
        onlinerTiresPage.navigateToLoginPage();
        return this;
    }

    public OnlinerTiresHelper clickTires() {
        onlinerTiresPage.clickTiresButton();
        return this;
    }
    public String getText() {
        return onlinerTiresPage.checkTiresElement();
    }
}

