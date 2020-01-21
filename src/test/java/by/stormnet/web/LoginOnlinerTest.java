package by.stormnet.web;

import by.stormnet.automation.core.utils.IOUtils;
import by.stormnet.web.helpers.LoginOnlinerHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginOnlinerTest {
    private LoginOnlinerHelper loginHelper = new LoginOnlinerHelper();
    private String username;
    private String password;

    @BeforeClass
    public void setUp() {
        username = IOUtils.loadGenericProperties("username", "configuration");
        password = IOUtils.loadGenericProperties("password", "configuration");
        loginHelper.openLoginPage();
    }

    @Test
    public void loginTest() {
        loginHelper.login(username, password);
        Assert.assertTrue(loginHelper.checkAvatarIsDisplayed(), "User is not logged in successfully!");
    }


}
