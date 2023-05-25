package com.saucelab.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriver {

    private static WebDriver chromeDriver;

    public static MyChromeDriver web(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        chromeDriver = new ChromeDriver(options);
        return new MyChromeDriver();
    }

    public WebDriver onUrl(String url){
        chromeDriver.get(url);
        chromeDriver.manage().window().maximize();
        return chromeDriver;
    }
}
