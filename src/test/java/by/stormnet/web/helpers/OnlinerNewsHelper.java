package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerNewsPage;

public class OnlinerNewsHelper {
    OnlinerNewsPage onNP = new OnlinerNewsPage();

    public boolean checkNews() {
        return onNP.newsPageIsDisplayed();
    }
}
