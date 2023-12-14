package com.dailycoder.config.converters;

import lombok.SneakyThrows;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;


public class StringToURLConverterClass implements Converter<URL> {

    @Override
    @SneakyThrows
    public URL convert(Method method, String strinURL) {
        return new URL(strinURL);
    }
}
