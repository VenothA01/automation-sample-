package com.dailycoder.driver;

import com.dailycoder.config.factory.ConfigFactory;
import com.dailycoder.driver.factory.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class Driver {

    public static void initDriver(){
        WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
        driver.get("https://www.google.co.in");
    }


    public static void  quit(){

    }
}
