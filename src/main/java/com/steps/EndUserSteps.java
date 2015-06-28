package com.steps;

import com.pages.HomePage;
import com.pages.MyAccountPage;
import com.pages.WelcomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static ch.lambdaj.Lambda.join;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {
    HomePage homepage;
    WelcomePage welcomepage;
    MyAccountPage myaccountpage;

    @Step
    public void log_in_as_registered_user(){
        homepage.login();
    }

    @Step
    public void wants_to_play_free(){
        homepage.play_free();
    }

    @Step
    public void assert_page(String page){
        welcomepage.assert_page(page);
    }

    @Step
    public void navigate_to(String page){
        welcomepage.navigate(page);
    }

    @Step
    public void verify_balance(){
        myaccountpage.verify_balance();
    }

    @Step
    public void go_to_gameduell(){
        homepage.go_to_gameduell();
    }

    @Step
    public void is_on_gameduell(){
        homepage.is_on_gameduell();
    }

    @Step
    public void assert_email_validation_link(){
        welcomepage.assert_email_validation();
    }
}