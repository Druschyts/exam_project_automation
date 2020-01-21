package by.stormnet.web;


import by.stormnet.web.helpers.OnlinerFilterHelper;
import by.stormnet.web.helpers.OnlinerGoodsHelper;
import by.stormnet.web.helpers.OnlinerMainHelper;
import by.stormnet.web.helpers.OnlinerNewsHelper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class OnlinerCatalogTest {
    private OnlinerMainHelper mainHelper = new OnlinerMainHelper();
    private OnlinerFilterHelper filterHelper = new OnlinerFilterHelper();
    private OnlinerGoodsHelper goodsHelper = new OnlinerGoodsHelper();



    @Test
    public void searchAndFilter() {
        String[] mas = {"ASUS", "2018", "для работы", "15\"", "16-24 ГБ"};
        mainHelper.openOnliner();
        mainHelper.search("Ноутбуки");
        filterHelper.filterBy(mas);
        filterHelper.openAnyItem();
        goodsHelper.checkForPage();
        Assert.assertTrue(goodsHelper.checkAllParams(), "Not filtered");
    }

}