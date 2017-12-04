package org.pft.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager{

    public WebDriver driver;
    private YandexHelper yandexHelper;
    public String target;
    public final Properties properties;

    public ApplicationManager() {
        properties = new Properties();
    }

    public YandexHelper getYandexHelper() {
        return yandexHelper;
    }

    public void init() throws IOException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        yandexHelper = new YandexHelper(driver);
        target = System.getProperty("target");
        File f = new File(String.format("src/test/resources/%s.properties", target));
        FileReader fr = new FileReader(f);
        properties.load(fr);
        fr.close();
    }

    public void stop() {
        driver.close();
        driver.quit();
    }
}
