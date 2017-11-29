package org.pft.appmanager;

import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected WebDriver driver;
    HelperBase (WebDriver driver){
        this.driver = driver;
    }
    protected void openPage(String url){
        driver.get(url);
    }
}
