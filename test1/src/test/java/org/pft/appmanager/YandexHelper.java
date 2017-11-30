package org.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pft.model.Query;

import java.util.ArrayList;
import java.util.List;

public class YandexHelper extends HelperBase {
    YandexHelper(WebDriver driver){
        super(driver);
    }
    public void openYandexPage() {
        openPage("https://www.yandex.ru/");
    }
    public void setSearchQuery(Query q) {
        WebElement searchField = driver.findElement(By.cssSelector("#text"));
        searchField.sendKeys(q.getQueryText());
    }

    public void clickSearhBtn() {
        WebElement searchBtn = driver.findElement(By.cssSelector("div.search2__button>button"));
        searchBtn.click();
    }

    public List<String> getAllResults(){
        List<String> results = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector(".main__content div.content__left>ul>li"));
        for(WebElement e : elements) {
            results.add(e.getText());
        }
        return  results;
    }

}
