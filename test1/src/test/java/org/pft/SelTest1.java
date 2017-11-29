package org.pft;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelTest1 extends TestBase{

    @Test
    public void testYandex1(){
        driver.get("https://www.yandex.ru/");
        setSearchQuery("пылесосы");
        clickSearhBtn();
    }

    private void clickSearhBtn() {
        WebElement searchBtn = driver.findElementByCssSelector("div.search2__button>button");
        searchBtn.click();
    }

    private void setSearchQuery(String text) {
        WebElement searchField = driver.findElementByCssSelector("#text");
        searchField.sendKeys(text);
    }

}
