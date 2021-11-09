package com.utils;

import com.creditdatamw.zerocell.Reader;

import java.io.File;
import java.util.List;

public final class GetExcelData {
    private GetExcelData(){}


    public static List<ExcelReader> getGetTestData() {
        return getTestData;
    }

    private static List<ExcelReader> getTestData = null;

    static {
        getTestData = Reader.of(ExcelReader.class)
                .from(new File("src/test/resources/Excel.xlsx")).sheet("Sheet1")
                .skipHeaderRow(true).list();

    }

}
