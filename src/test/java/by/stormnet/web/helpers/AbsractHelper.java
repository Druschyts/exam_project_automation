package by.stormnet.web.helpers;

import by.stormnet.web.pages.AbstractPage;

public class AbsractHelper {

    AbstractPage abstractPage = new AbstractPage();

    public void close() {
        abstractPage.getDriver().close();
    }

}
