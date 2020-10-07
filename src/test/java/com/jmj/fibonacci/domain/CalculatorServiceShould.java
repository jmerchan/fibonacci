package com.jmj.fibonacci.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorServiceShould {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void calculate() {
        long expectedResult = 75025L;

        assertThat(calculatorService.calculateFibonacci(new NumberToCalculate(25)))
                .isEqualTo(expectedResult);
    }
}