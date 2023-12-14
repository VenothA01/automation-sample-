package com.dailycoder.driver.manager;

import com.dailycoder.config.factory.ConfigFactory;
import com.dailycoder.model.BrowserType;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridFireFoxManager {

    private SeleniumGridFireFoxManager(){

    }

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.FIREFOX.toString());
        return new RemoteWebDriver(ConfigFactory.getConfig().SeleniumGridURL(),capabilities);

    }
}
