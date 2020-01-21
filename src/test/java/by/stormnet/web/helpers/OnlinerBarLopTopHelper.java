package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarLopTopPage;

public class OnlinerBarLopTopHelper extends AbsractHelper {

    OnlinerBarLopTopPage onlinerBarLopTopPage = new OnlinerBarLopTopPage();

    public OnlinerBarLopTopHelper openLoginPage() {
        onlinerBarLopTopPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarLopTopHelper clickBaraButton() {
        onlinerBarLopTopPage.clickBarButton();
        return this;
    }

    public OnlinerBarLopTopHelper clickLopTopSection() {
        onlinerBarLopTopPage.clickLopTopSection();
        return this;
    }

    public String getText() {
        return onlinerBarLopTopPage.lopTopElement();
    }
}



