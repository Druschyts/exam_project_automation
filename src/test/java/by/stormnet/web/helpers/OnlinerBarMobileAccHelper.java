package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarMobileAccPage;

public class OnlinerBarMobileAccHelper extends AbsractHelper {
    OnlinerBarMobileAccPage onlinerBarMobileAccPage = new OnlinerBarMobileAccPage();

    public OnlinerBarMobileAccHelper openLoginPage() {
        onlinerBarMobileAccPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarMobileAccHelper clickMobileAccButton() {
        onlinerBarMobileAccPage.clickBarButton();
        return this;
    }

    public OnlinerBarMobileAccHelper clickMobileAccSection() {
        onlinerBarMobileAccPage.clickMobileAccSection();
        return this;
    }

    public String getText() {
        return onlinerBarMobileAccPage.mobileAccElement();
    }
}
