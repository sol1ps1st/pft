package org.pft.tests;

import org.hamcrest.MatcherAssert;
import org.pft.model.Query;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

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
        Assert.assertTrue(results.get(3).indexOf("пыл") != -1);
        MatcherAssert.assertThat(1, equalTo(1));
    }
}
