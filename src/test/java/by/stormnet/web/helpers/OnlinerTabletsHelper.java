package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerTabletsPage;
import by.stormnet.web.pages.OnlinerTiresPage;

public class OnlinerTabletsHelper extends AbsractHelper {
    OnlinerTabletsPage onlinerTabletsPage = new OnlinerTabletsPage();

    public OnlinerTabletsHelper openLoginPage() {
        onlinerTabletsPage.navigateToLoginPage();
        return this;
    }

    public OnlinerTabletsHelper clickTires() {
        onlinerTabletsPage.clickTabletsButton();
        return this;
    }

    public String getText() {
        return onlinerTabletsPage.checkTabletsElement();
    }
}

