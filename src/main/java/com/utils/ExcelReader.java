package com.utils;

import com.creditdatamw.zerocell.annotation.Column;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@ToString
public class  ExcelReader {

    //POJO
    @Column(name = "symbol", index = 0)
    private String symbol;
    @Column(name = "derivativePosition", index = 1, converterClass = StringToInteger.class)
    private int derivativePosition;
    @Column(name = "notionalContract", index = 2)
    private String notionalContract;
    @Column(name = "contractLabel", index = 3)
    private String contractLabel;
    @Column(name = "rollDates", index = 4, converterClass = StringToLocalDateConverter.class)
    private LocalDate rollDates;
    @Column(name = "ftd1", index = 5, converterClass = StringToLocalDateConverter.class)
    private LocalDate ftd;
    @Column(name = "ltd", index = 6, converterClass = StringToLocalDateConverter.class)
    private LocalDate ltd;
    @Column(name = "frequency", index = 7)
    private String frequency;
}
