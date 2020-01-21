package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarApplePage;

public class OnlinerBarAppleHelper extends AbsractHelper {
    OnlinerBarApplePage onlinerBarApplePage = new OnlinerBarApplePage();

    public OnlinerBarAppleHelper openLoginPage() {
        onlinerBarApplePage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarAppleHelper clickAppButton() {
        onlinerBarApplePage.clickBarButton();
        return this;
    }

    public OnlinerBarAppleHelper clickAppSection() {
        onlinerBarApplePage.clickAppleSection();
        return this;
    }

    public String getText() {
        return onlinerBarApplePage.appleElement();
    }
}

