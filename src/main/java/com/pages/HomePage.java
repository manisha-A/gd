package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by manisha on 28/06/15.
 */
public class HomePage extends PageObject{
    private static String  APP_URL="http://www.gameduell.com/";

    @FindBy(className = "registerLink")
    private WebElementFacade newHere;

    @FindBy(id = "loginLink")
    private WebElementFacade login;

    @FindBy(name = "j_username")
    private WebElementFacade loginName;

    @FindBy(name = "j_password")
    private WebElementFacade loginPassword;

    public void login(){
        loginName.clear();
        loginName.sendKeys("gd1@trashmail.com");
        loginPassword.clear();
        loginPassword.sendKeys("Mani@trash");
        login.click();
    }

    public void go_to_gameduell(){
        getDriver().get(APP_URL);
    }

    public void play_free(){
        newHere.click();
    }

    public void is_on_gameduell(){

    }
}
