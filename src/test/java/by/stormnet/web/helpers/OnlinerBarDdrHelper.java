package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarDdrPage;

public class OnlinerBarDdrHelper extends AbsractHelper {
    OnlinerBarDdrPage onlinerBarDdrPage = new OnlinerBarDdrPage();

    public OnlinerBarDdrHelper openLoginPage() {
        onlinerBarDdrPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarDdrHelper clickDdrButton() {
        onlinerBarDdrPage.clickBarButton();
        return this;
    }

    public OnlinerBarDdrHelper clickDdrSection() {
        onlinerBarDdrPage.clickDdrSection();
        return this;
    }

    public String getText() {
        return onlinerBarDdrPage.ddrElement();
    }
}

