package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerTvPage;

public class OnlinerTvHelper extends AbsractHelper {
    OnlinerTvPage onlinerTvPage = new OnlinerTvPage();

    public OnlinerTvHelper openLoginPage() {
        onlinerTvPage.navigateToLoginPage();
        return this;
    }

    public OnlinerTvHelper clickTv() {
        onlinerTvPage.clickTvButton();
        return this;
    }

    public String getText() {
        return onlinerTvPage.checkTvElement();
    }
}

