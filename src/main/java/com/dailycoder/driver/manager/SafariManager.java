package com.dailycoder.driver.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public final class SafariManager {

    private SafariManager(){}


    public static WebDriver getSafariDriver(){
        WebDriverManager.safaridriver().arm64().setup();
        return new SafariDriver();
    }
}
