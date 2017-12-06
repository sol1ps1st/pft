package org.pft.appmanager;

import org.apache.http.impl.client.CloseableHttpClient;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager{

    //CloseableHttpClient
    private WebDriver driver;
    public WebDriver getDriver(){
        if (driver == null){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return  driver;
    }
    private YandexHelper yandexHelper;
    public String target;

    private final Properties properties;
    public Properties getProperties() {
        return properties;
    }

    public ApplicationManager() {
        properties = new Properties();
    }

    public YandexHelper getYandexHelper() {
        if (yandexHelper == null){
            yandexHelper = new YandexHelper(getDriver());
        }
        return yandexHelper;
    }

    public void init() throws IOException {
        target = System.getProperty("target", "local");
        File f = new File(String.format("src/test/resources/%s.properties", target));
        FileReader fr = new FileReader(f);
        properties.load(fr);
        fr.close();
    }

    public void stop() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
