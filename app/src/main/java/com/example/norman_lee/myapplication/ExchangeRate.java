package com.example.norman_lee.myapplication;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeRate {

    public static double calculateExchangeRate(){

        return 2.95;
    }

    //TODO 3.9 Calculate the exchange rate
    public static double calculateExchangeRate(String A, String B)
            throws NumberFormatException, ArithmeticException {

        BigDecimal valueA = new BigDecimal(A);
        BigDecimal valueB = new BigDecimal(B);
        return valueB.divide(valueA, RoundingMode.HALF_UP).doubleValue();
    }


}
