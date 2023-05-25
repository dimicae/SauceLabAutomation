package com.saucelab.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/login.feature",
        glue = "com.saucelab.stepdefinitions")
public class LoginRunner {
}
