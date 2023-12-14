package com.dailycoder.driver.manager

import com.dailycoder.config.factory.ConfigFactory
import com.dailycoder.model.BrowserType
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

public class SeleniumGridChromeManager {

    private SeleniumGridChromeManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.CHROME);
        return new RemoteWebDriver(ConfigFactory.getConfig().SeleniumGridURL(),capabilities);
    }
}
