package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerTvPage;
import by.stormnet.web.pages.OnlinerVideoCardsPage;

public class OnlinerVideoCardsHelper extends AbsractHelper {
    OnlinerVideoCardsPage onlinerVideoCardsPage = new OnlinerVideoCardsPage();

    public OnlinerVideoCardsHelper openLoginPage() {
        onlinerVideoCardsPage.navigateToLoginPage();
        return this;
    }

    public OnlinerVideoCardsHelper clickVideoCards() {
        onlinerVideoCardsPage.clickVideoCardsButton();
        return this;
    }

    public String getText() {
        return onlinerVideoCardsPage.checkVideoCardsElement();
    }
}

