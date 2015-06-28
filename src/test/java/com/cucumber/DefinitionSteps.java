package com.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Before
    public void beforeEveryScenario() throws Exception{
        endUser.go_to_gameduell();
        endUser.getDriver().manage().window().maximize();
    }

    @After
    public void afterEveryScenario(){
        endUser.getDriver().close();
        endUser.getDriver().quit();
    }

    @When("^I log in as a registered user$")
    public void i_log_in_as_a_registered_user() {
       endUser.log_in_as_registered_user();
    }

    @When("^I want to play for free$")
    public void i_want_to_play_for_free() {
        endUser.wants_to_play_free();
    }

    @When("^I am registered as a user$")
    public void i_am_registered_as_a_user() {
    }

    @Then("^I should be on \"(.*?)\" page$")
    public void i_should_be_on_page(String page) {
        endUser.assert_page(page);
    }

    @When("^I navigate to \"(.*?)\"$")
    public void i_navigate_to(String page) {
        endUser.navigate_to(page);
    }

    @Then("^account balance should be same in overview and account$")
    public void account_balance_should_be_same_in_overview_and_account() {
        endUser.verify_balance();
    }

    @Given("^I am on GameDuell website$")
    public void i_am_on_GameDuell_website() {
        endUser.is_on_gameduell();
    }

    @Then("^I should see emailValidation link$")
    public void i_should_see_emailValidation_link() {
        endUser.assert_email_validation_link();
    }
}
