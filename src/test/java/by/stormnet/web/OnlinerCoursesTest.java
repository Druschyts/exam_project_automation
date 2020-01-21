package by.stormnet.web;

import by.stormnet.web.helpers.OnlinerCoursesHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerCoursesTest {
    OnlinerCoursesHelper onlinerCoursesHelper = new OnlinerCoursesHelper();

    @BeforeClass
    public void setUp() {
        onlinerCoursesHelper.openLoginPage();
    }

    @Test
    public void checkCourseTest() {
        onlinerCoursesHelper.clickWeather();
        Assert.assertEquals(onlinerCoursesHelper.getText(), "Лучшие курсы валют");
    }
}
