package org.pft.tests;

import org.pft.model.Query;
import org.testng.annotations.Test;

public class SelTestYandex extends TestBase{

    @Test
    public void testYandex1(){
        app.getYandexHelper().openYandexPage();
        app.getYandexHelper().setSearchQuery(new Query("пылесосы"));
        app.getYandexHelper().clickSearhBtn();
    }
}
