package com.magomed.calculatorspring.service;

import java.text.DecimalFormat;

public class CalculatorsService {
    public double addition(double firstValue, double secondValue){
        return firstValue+secondValue;
    }
    public double subtraction(double firstValue, double secondValue){
        return firstValue-secondValue;
    }
    public double multiplication(double firstValue, double secondValue){
        return firstValue*secondValue;
    }
    public String division(double firstValue, double secondValue){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
            return decimalFormat.format(firstValue/secondValue);
    }
}
