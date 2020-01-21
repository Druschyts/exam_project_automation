package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerMobilePhonePage;

public class OnlinerMobilePhoneHelper extends AbsractHelper {
    OnlinerMobilePhonePage onlinerMobilePhonePage = new OnlinerMobilePhonePage();

    public OnlinerMobilePhoneHelper openLoginPage() {
        onlinerMobilePhonePage.navigateToLoginPage();
        return this;
    }

    public OnlinerMobilePhoneHelper clickMobilePhone() {
        onlinerMobilePhonePage.clickMobilePhoneButton();
        return this;
    }

    public String getText() {
        return onlinerMobilePhonePage.checkMobilePhoneButton();
    }
}

