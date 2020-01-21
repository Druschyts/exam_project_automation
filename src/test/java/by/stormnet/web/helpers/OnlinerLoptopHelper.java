package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerLoptopPage;
import by.stormnet.web.pages.OnlinerMobilePhonePage;

public class OnlinerLoptopHelper extends AbsractHelper {
    OnlinerLoptopPage onlinerLoptopPage = new OnlinerLoptopPage();

    public OnlinerLoptopHelper openLoginPage() {
        onlinerLoptopPage.navigateToLoginPage();
        return this;
    }

    public OnlinerLoptopHelper clickLoptopButton() {
        onlinerLoptopPage.clickLoptopButton();
        return this;
    }

    public String getText() {
        return onlinerLoptopPage.checkLoptopButton();
    }
}


