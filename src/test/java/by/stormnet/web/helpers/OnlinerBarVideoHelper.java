package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarVideoPage;

public class OnlinerBarVideoHelper extends AbsractHelper {
    OnlinerBarVideoPage onlinerBarVideoPage = new OnlinerBarVideoPage();

    public OnlinerBarVideoHelper openLoginPage() {
        onlinerBarVideoPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarVideoHelper clickVideoButton() {
        onlinerBarVideoPage.clickBarButton();
        return this;
    }

    public OnlinerBarVideoHelper clickVideoSection() {
        onlinerBarVideoPage.clickVideoSection();
        return this;
    }

    public String getText() {
        return onlinerBarVideoPage.videoElement();
    }
}

