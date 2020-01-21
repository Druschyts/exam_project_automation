package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarClothesPage;

public class OnlinerBarClothesHelper extends AbsractHelper {

    OnlinerBarClothesPage onlinerBarClothesPage = new OnlinerBarClothesPage();

    public OnlinerBarClothesHelper openLoginPage() {
        onlinerBarClothesPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarClothesHelper clickClothesButton() {
        onlinerBarClothesPage.clickBarButton();
        return this;
    }

    public OnlinerBarClothesHelper clickClothesSection() {
        onlinerBarClothesPage.clickClothesSection();
        return this;
    }

    public String getText() {
        return onlinerBarClothesPage.clothesElement();
    }
}

