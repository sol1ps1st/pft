package org.pft.bdd;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.pft.appmanager.ApplicationManager;
import org.pft.model.Query;
import org.testng.Assert;

import java.io.IOException;

public class YandexSearchStepDefinitions {

    private ApplicationManager app;

    @Before
    public void init() throws IOException {
        app = new ApplicationManager();
        app.init();
    }

    @After
    public void stop(){
        app.stop();
        app = null;
    }

    @Given("^yandex site$")
    public void openYandex(){
        app.getYandexHelper().openYandexPage();
    }

    @When("^I search with text (.+)")
    public void search(String text){
        app.getYandexHelper().setSearchQuery(new Query(text));
        app.getYandexHelper().clickSearhBtn();
    }

    @Then("^I have search's results$")
    public void isResultExists(){
        Assert.assertTrue(app.getYandexHelper().isResultsExist());
    }
}
