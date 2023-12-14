package com.dailycoder.config.converters;

import com.dailycoder.model.BrowserType;
import com.dailycoder.model.RemoTeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToRemoteBrowserConverter implements Converter<RemoTeBrowserType> {

    @Override
    public RemoTeBrowserType convert(Method method, String remoteBroserType) {
        return RemoTeBrowserType.valueOf(remoteBroserType.toUpperCase());
    }
}

