package com.saucelab.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static com.saucelab.userinterfaces.IndexPage.HEADER_LBL;

public class WebPageTitle implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(Visibility.of(HEADER_LBL));
    }

    public static WebPageTitle visibility() {
        return new WebPageTitle();
    }
}
