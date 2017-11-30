package org.pft.tests;

import org.pft.model.Query;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelTestYandex extends TestBase{

    @Test
    public void testYandex1(){
        app.getYandexHelper().openYandexPage();
        app.getYandexHelper().setSearchQuery(new Query("пылесосы"));
        app.getYandexHelper().clickSearhBtn();
    }
    @Test
    public void testYandexGetThirdResult(){
        app.getYandexHelper().openYandexPage();
        app.getYandexHelper().setSearchQuery(new Query("пылесосы"));
        app.getYandexHelper().clickSearhBtn();
        List<String> results = app.getYandexHelper().getAllResults();
        Assert.assertTrue(results.get(3).indexOf("TEXUBORKA") != -1);
    }
}
