package org.pft;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelTest1 {
    public ChromeDriver driver;

    @BeforeMethod
    public void init(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void testYandex1(){
        driver.get("https://www.yandex.ru/");
        WebElement searchField = driver.findElementByCssSelector("#text");
        searchField.sendKeys("пылесосы");
        WebElement searchBtn = driver.findElementByCssSelector("div.search2__button>button");
        searchBtn.click();
    }

    @AfterMethod
    public void end(){
        driver.close();
        driver.quit();
    }

}
