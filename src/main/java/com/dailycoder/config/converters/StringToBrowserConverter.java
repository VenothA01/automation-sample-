package com.dailycoder.config.converters;

import com.dailycoder.model.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserConverter implements Converter<BrowserType> {

    @Override
    public BrowserType convert(Method method, String browserName) {

        Map<String,BrowserType> map = Map.of(
                "CHROME",BrowserType.CHROME,
                "SAFARI",BrowserType.SAFARI,
            "FIREFOX",BrowserType.FIREFOX);
;           return BrowserType.valueOf(browserName.toUpperCase());
    }
}

