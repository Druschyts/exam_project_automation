package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerBarUsbPage;

public class OnlinerBarUsbHelper extends AbsractHelper {
    OnlinerBarUsbPage onlinerBarUsbPage = new OnlinerBarUsbPage();

    public OnlinerBarUsbHelper openLoginPage() {
        onlinerBarUsbPage.navigateToLoginPage();
        return this;
    }

    public OnlinerBarUsbHelper clickUsbButton() {
        onlinerBarUsbPage.clickBarButton();
        return this;
    }

    public OnlinerBarUsbHelper clickUsbSection() {
        onlinerBarUsbPage.clickUsbSection();
        return this;
    }

    public String getText() {
        return onlinerBarUsbPage.usbElement();
    }
}

