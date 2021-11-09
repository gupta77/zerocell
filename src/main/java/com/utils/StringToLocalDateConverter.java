package com.utils;

import com.creditdatamw.zerocell.ZeroCellException;
import com.creditdatamw.zerocell.converter.Converter;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class StringToLocalDateConverter implements Converter<LocalDate> {
    @Override
    public LocalDate convert(String value, String s1, int i) {
        if (value == null) return null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        try {
            return LocalDate.parse(value, formatter);
        } catch (DateTimeParseException e) {
            throw new ZeroCellException(e);
        }
    }
}
