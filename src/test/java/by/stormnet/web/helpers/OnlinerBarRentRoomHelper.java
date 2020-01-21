package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarRentRoomPage;

public class OnlinerBarRentRoomHelper extends AbsractHelper {

    OnlinerBarRentRoomPage onlinerBarRentRoomPage = new OnlinerBarRentRoomPage();

    public OnlinerBarRentRoomHelper openLoginPage() {
        onlinerBarRentRoomPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarRentRoomHelper clickRentRoomButton() {
        onlinerBarRentRoomPage.clickBarButton();
        return this;
    }

    public OnlinerBarRentRoomHelper clickRentRoomSection() {
        onlinerBarRentRoomPage.clickRentRoomSection();
        return this;
    }

    public String getText() {
        return onlinerBarRentRoomPage.rentRoomElement();
    }
}


