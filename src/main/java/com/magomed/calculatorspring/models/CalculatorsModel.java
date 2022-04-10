package com.magomed.calculatorspring.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculatorsModel {
    public double firstValue=0;
    public double secondValue=0;

    public CalculatorsModel(){

    }
}
