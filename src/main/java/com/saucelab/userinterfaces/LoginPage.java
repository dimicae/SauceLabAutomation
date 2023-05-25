package com.saucelab.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target USERNAME_TXT = Target.the("Enter username").located(By.id("user-name"));
    public static final Target PASSWORD_TXT = Target.the("Enter password").located(By.id("password"));
    public static final Target LOGIN_BTN = Target.the("Click on Login button").located(By.id("login-button"));
}
