package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerCamerasPage;

public class OnlinerCamerasHelper extends AbsractHelper {
    OnlinerCamerasPage onlinerCamerasPage = new OnlinerCamerasPage();

    public OnlinerCamerasHelper openLoginPage() {
        onlinerCamerasPage.navigateToLoginPage();
        return this;
    }

    public OnlinerCamerasHelper clickCameras() {
        onlinerCamerasPage.clickCamerasButton();
        return this;
    }

    public String getText() {
        return onlinerCamerasPage.camerasElement();
    }
}
