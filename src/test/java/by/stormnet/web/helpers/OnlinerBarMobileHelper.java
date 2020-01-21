package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarMobilePage;
import by.stormnet.web.pages.OnlinerCamerasPage;

public class OnlinerBarMobileHelper {

    OnlinerBarMobilePage onlinerBarMobilePage = new OnlinerBarMobilePage();

    public OnlinerBarMobileHelper openLoginPage() {
        onlinerBarMobilePage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarMobileHelper clickMobileButton() {
        onlinerBarMobilePage.clickBarButton();
        return this;
    }

    public OnlinerBarMobileHelper clickMobileSection() {
        onlinerBarMobilePage.clickMobileSection();
        return this;
    }

    public String getText() {
        return onlinerBarMobilePage.mobileElement();
    }
}
