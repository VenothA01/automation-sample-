package com.dailycoder.driver.factory.remote;

import com.dailycoder.config.factory.ConfigFactory;
import com.dailycoder.model.RemoTeBrowserType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){

    }

    public static WebDriver getRemoteDriver(){
        WebDriver driver = null;

        return driver;
    }

    public static boolean selenium(){
        return ConfigFactory.getConfig().browserRemoteMode() == RemoTeBrowserType.SELENIUM;
    }

    public static boolean selenoid(){
        return ConfigFactory.getConfig().browserRemoteMode() == RemoTeBrowserType.SELENOID;
    }

    public static boolean browserStack(){
        return ConfigFactory.getConfig().browserRemoteMode() == RemoTeBrowserType.BROWSER_STACK;
    }

}
