package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerMainHelper;
import by.stormnet.web.helpers.OnlinerNewsHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlinerNewsTest {

    private OnlinerMainHelper mainHelper = new OnlinerMainHelper();
    private OnlinerNewsHelper newsHelper = new OnlinerNewsHelper();

    @Test
    public void openNews() {
        mainHelper.openOnliner().openNews();
        Assert.assertTrue(newsHelper.checkNews(), "News is opened!");
    }

}

