package com.jmj.fibonacci.usecase;

import com.jmj.fibonacci.domain.CalculatorService;
import com.jmj.fibonacci.domain.NumberToCalculate;

import javax.inject.Named;

@Named
public class CalculateFibonacci {
    private final CalculatorService calculatorService;

    public CalculateFibonacci(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public Long execute(NumberToCalculate numberToCalculate) {
        return calculatorService.calculateFibonacci(numberToCalculate);
    }
}
