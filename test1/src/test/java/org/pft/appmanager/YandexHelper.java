package org.pft.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pft.model.Query;

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

}
