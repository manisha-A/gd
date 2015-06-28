package com.cucumber;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

}
