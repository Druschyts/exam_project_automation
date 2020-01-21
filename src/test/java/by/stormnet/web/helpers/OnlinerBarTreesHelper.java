package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarRentRoomPage;
import by.stormnet.web.pages.OnlinerBarTreesPage;

public class OnlinerBarTreesHelper extends AbsractHelper {
    OnlinerBarTreesPage onlinerBarTreesPage = new OnlinerBarTreesPage();

    public OnlinerBarTreesHelper openLoginPage() {
        onlinerBarTreesPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarTreesHelper clickTressButton() {
        onlinerBarTreesPage.clickBarButton();
        return this;
    }

    public OnlinerBarTreesHelper clickTreesSection() {
        onlinerBarTreesPage.clickTressSection();
        return this;
    }

    public String getText() {
        return onlinerBarTreesPage.treesElement();
    }
}


