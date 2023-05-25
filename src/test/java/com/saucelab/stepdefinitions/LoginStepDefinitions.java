package com.saucelab.stepdefinitions;

import com.saucelab.questions.WebPageTitle;
import com.saucelab.tasks.LogIn;
import com.saucelab.utils.drivers.MyChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinitions {

    Actor tom = new Actor("Tom");

    @Given("the User is on SauceDemo login page")
    public void browseWebPage() {
        tom.can(BrowseTheWeb.with(MyChromeDriver.web().onUrl("https://www.saucedemo.com/")));
    }

    @When("the user enters the correct user and password")
    public void loginPage() {
        tom.wasAbleTo(LogIn.page());
    }

    @Then("the user should see the Welcome message")
    public void validateMessage() {
        tom.should(seeThat(WebPageTitle.visibility(), Matchers.equalTo(true)));
    }
}
