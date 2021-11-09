package com.utils;

import com.creditdatamw.zerocell.converter.Converter;

import java.util.Objects;

public class StringToInteger implements Converter<Integer> {
    @Override
    public Integer convert(String value, String s1, int i) {
        Objects.requireNonNull(value);
        return Integer.parseInt(value );
    }
}
