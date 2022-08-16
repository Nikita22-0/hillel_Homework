package com.hillel.paschenko.lesson15.utils;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounder {

    public static double rounding(double value) {
        return new BigDecimal(value).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
