package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerPhonesPage;
import by.stormnet.web.pages.OnlinerTiresPage;

public class OnlinerPhonesHelper extends AbsractHelper {
    OnlinerPhonesPage onlinerPhonesPage = new OnlinerPhonesPage();

    public OnlinerPhonesHelper openLoginPage() {
        onlinerPhonesPage.navigateToLoginPage();
        return this;
    }

    public OnlinerPhonesHelper clickTires() {
        onlinerPhonesPage.clickPhonesButton();
        return this;
    }

    public String getText() {
        return onlinerPhonesPage.checkPhonesElement();
    }
}
