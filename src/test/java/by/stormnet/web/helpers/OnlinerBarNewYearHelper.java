package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarNewYearPage;

public class OnlinerBarNewYearHelper extends AbsractHelper {
    OnlinerBarNewYearPage onlinerBarNewYearPage = new OnlinerBarNewYearPage();

    public OnlinerBarNewYearHelper openLoginPage() {
        onlinerBarNewYearPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarNewYearHelper clickNewYearButton() {
        onlinerBarNewYearPage.clickBarButton();
        return this;
    }

    public OnlinerBarNewYearHelper clickNewYearSection() {
        onlinerBarNewYearPage.clickNewYearSection();
        return this;
    }

    public String getText() {
        return onlinerBarNewYearPage.newYearElement();
    }
}
