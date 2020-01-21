package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarRadioPage;

public class OnlinerBarRadioHelper extends AbsractHelper {
    OnlinerBarRadioPage onlinerBarRadioPage = new OnlinerBarRadioPage();

    public OnlinerBarRadioHelper openLoginPage() {
        onlinerBarRadioPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarRadioHelper clickRadioButton() {
        onlinerBarRadioPage.clickBarButton();
        return this;
    }

    public OnlinerBarRadioHelper clickRadioSection() {
        onlinerBarRadioPage.clickRadioSection();
        return this;
    }

    public String getText() {
        return onlinerBarRadioPage.radioElement();
    }
}

