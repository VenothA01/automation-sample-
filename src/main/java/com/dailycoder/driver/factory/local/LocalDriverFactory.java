package com.dailycoder.driver.factory.local;

import com.dailycoder.config.factory.ConfigFactory;
import com.dailycoder.driver.manager.ChromeManager;
import com.dailycoder.driver.manager.SafariManager;
import com.dailycoder.model.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){

    }

    public static WebDriver getDriver(BrowserType browserType){
        WebDriver driver = null;
        
        if(chromeBrowser(browserType))
            driver = ChromeManager.getChromeDriver();
        else driver = SafariManager.getSafariDriver();

        return driver;
    }

    public static boolean chromeBrowser(BrowserType browserType){
        return browserType==BrowserType.CHROME;
    }

    public static boolean safariDriver(BrowserType browserType){
        return browserType ==BrowserType.SAFARI;
    }

    public static boolean fireFoxDriver(BrowserType browserType){
        return  browserType == BrowserType.FIREFOX;
    }


}
