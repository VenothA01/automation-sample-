package com.dailycoder;


import com.dailycoder.config.FrameworkConfig;
import com.dailycoder.config.factory.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigCache;
import org.awaitility.core.ConditionFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DemoTest {

    @Test
    public void testLogin(){
        FrameworkConfig config = ConfigCache.getOrCreate(FrameworkConfig.class);
        System.out.println(ConfigFactory.getConfig().browser());
//        WebDriverManager.safaridriver().arm64().setup();;
//        WebDriver driver = new SafariDriver();
//        driver.get("https://www.google.com/");
//        driver.quit();
    }
}
