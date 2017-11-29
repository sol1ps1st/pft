package org.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pft.model.Query;

public class YandexHelper {
    private WebDriver driver;
    YandexHelper(WebDriver driver){
        this.driver = driver;
    }
    public void openYandexPage() {
        driver.get("https://www.yandex.ru/");
    }
    public void setSearchQuery(Query q) {
        WebElement searchField = driver.findElement(By.cssSelector("#text"));
        searchField.sendKeys(q.getQueryText());
    }

    public void clickSearhBtn() {
        WebElement searchBtn = driver.findElement(By.cssSelector("div.search2__button>button"));
        searchBtn.click();
    }

}
