package org.pft.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager{

    public WebDriver driver;
    private YandexHelper yandexHelper;
    public YandexHelper getYandexHelper() {
        return yandexHelper;
    }

    public void init() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        yandexHelper = new YandexHelper(driver);
    }

    public void stop() {
        driver.close();
        driver.quit();
    }
}
