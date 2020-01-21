package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarMobileServicesPage;

public class OnlinerBarMobileServicesHelper extends AbsractHelper {
    OnlinerBarMobileServicesPage onlinerBarMobileServicesPage = new OnlinerBarMobileServicesPage();

    public OnlinerBarMobileServicesHelper openLoginPage() {
        onlinerBarMobileServicesPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarMobileServicesHelper clickMobileButton() {
        onlinerBarMobileServicesPage.clickBarButton();
        return this;
    }

    public OnlinerBarMobileServicesHelper clickMobileServicesSection() {
        onlinerBarMobileServicesPage.clickMobileServicesSection();
        return this;
    }

    public String getText() {
        return onlinerBarMobileServicesPage.mobileServicesElement();
    }
}

