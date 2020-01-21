package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarMobilePage;
import by.stormnet.web.pages.OnlinerBarSaleRoomPage;

public class OnlinerBarSaleRoomHelper extends AbsractHelper {

    OnlinerBarSaleRoomPage onlinerBarSaleRoomPage = new OnlinerBarSaleRoomPage();

    public OnlinerBarSaleRoomHelper openLoginPage() {
        onlinerBarSaleRoomPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarSaleRoomHelper clickSaleRoomButton() {
        onlinerBarSaleRoomPage.clickBarButton();
        return this;
    }

    public OnlinerBarSaleRoomHelper clickSaleRoomSection() {
        onlinerBarSaleRoomPage.clickSaleRoomSection();
        return this;
    }

    public String getText() {
        return onlinerBarSaleRoomPage.saleRoomElement();
    }
}

