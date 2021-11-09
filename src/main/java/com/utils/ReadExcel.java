package com.utils;

import com.creditdatamw.zerocell.Reader;

import java.io.File;
import java.util.List;

public class ReadExcel {

    public List getReadExcelData(Class className, String path, String sheetName){
        return Reader.of(className)
                .from(new File(path)).sheet(sheetName)
                .skipHeaderRow(true).list();
    }
}
