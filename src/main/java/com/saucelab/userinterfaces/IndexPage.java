package com.saucelab.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IndexPage {
    public static final Target HEADER_LBL = Target.the("Get header message").located(By.className("app_logo"));
}
