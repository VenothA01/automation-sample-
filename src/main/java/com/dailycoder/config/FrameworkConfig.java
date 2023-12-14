package com.dailycoder.config;

import com.dailycoder.config.converters.StringToBrowserConverter;
import com.dailycoder.config.converters.StringToURLConverterClass;
import com.dailycoder.model.BrowserType;
import com.dailycoder.model.RemoTeBrowserType;
import com.dailycoder.model.RunModeType;
import org.aeonbits.owner.Config;
import org.checkerframework.checker.units.qual.K;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserConverter.class)
    BrowserType browser();


    @Key("runMode")
    RunModeType runMode();

    @Key("browserRemoteMode")
    RemoTeBrowserType browserRemoteMode();

    @ConverterClass(StringToURLConverterClass.class)
    URL SeleniumGridURL();


}
