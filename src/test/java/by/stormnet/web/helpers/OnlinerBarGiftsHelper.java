package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarGiftsPage;


public class OnlinerBarGiftsHelper extends AbsractHelper {

    OnlinerBarGiftsPage onlinerBarGiftsPage = new OnlinerBarGiftsPage();

    public OnlinerBarGiftsHelper openLoginPage() {
        onlinerBarGiftsPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarGiftsHelper clickGiftsButton() {
        onlinerBarGiftsPage.clickBarButton();
        return this;
    }

    public OnlinerBarGiftsHelper clickGiftsSection() {
        onlinerBarGiftsPage.clickGiftsSection();
        return this;
    }

    public String getText() {
        return onlinerBarGiftsPage.giftsElement();
    }
}

