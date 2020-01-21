package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerClockPage;

public class OnlinerClockHelper extends AbsractHelper {
    OnlinerClockPage onlinerClockPage = new OnlinerClockPage();

    public OnlinerClockHelper openLoginPage() {
        onlinerClockPage.navigateToLoginPage();
        return this;
    }

    public OnlinerClockHelper clickClock() {
        onlinerClockPage.clickClockButton();
        return this;
    }

    public String getText() {
        return onlinerClockPage.checkClockElement();
    }
}
