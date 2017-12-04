package org.pft.tests;

import org.hamcrest.MatcherAssert;
import org.pft.model.Query;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

public class SelTestYandex extends TestBase{

//    @DataProvider
//    public Iterator<Object[]> validQueries(){
//        List<Object[]> list = new ArrayList<Object[]>();
//        list.add(new Object[]{"google"});
//        list.add(new Object[]{"chrome"});
//        list.add(new Object[]{"пылесосы"});
//        return list.iterator();
//    }

//    @Test(dataProvider = "validQueries")
//    public void testYandex1(String text){
//        app.getYandexHelper().openYandexPage();
//        app.getYandexHelper().setSearchQuery(new Query(text));
//        app.getYandexHelper().clickSearhBtn();
//        Assert.assertTrue(app.getYandexHelper().isResultsExist());
//    }

    @DataProvider
    public Iterator<Object[]> validQueries(){
        List<Object[]> list = new ArrayList<Object[]>();
        list.add(new Object[]{new Query("google")});
        list.add(new Object[]{new Query("yan")});
        //list.add(new Object[]{new Query("пылесосы")});
        list.add(new Object[]{new Query(app.properties.getProperty("target"))});
        return list.iterator();
    }

    @Test(dataProvider = "validQueries")
    public void testYandex1(Query q){
        app.getYandexHelper().openYandexPage();
        app.getYandexHelper().setSearchQuery(q);
        app.getYandexHelper().clickSearhBtn();
        Assert.assertTrue(app.getYandexHelper().isResultsExist());
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
