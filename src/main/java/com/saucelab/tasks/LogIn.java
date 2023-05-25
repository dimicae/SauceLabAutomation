package com.saucelab.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucelab.userinterfaces.LoginPage.*;

public class LogIn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("standard_user").into(USERNAME_TXT),
                Enter.theValue("secret_sauce").into(PASSWORD_TXT),
                Click.on(LOGIN_BTN));

    }

    public static LogIn page(){
        return Tasks.instrumented(LogIn.class);
    }

}
