package com.jmj.fibonacci.usecase;

import com.jmj.fibonacci.domain.NumberToCalculate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculateFibonacciShould {

    private CalculateFibonacci calculateFibonacci;

    @BeforeEach
    void setUp() {
        calculateFibonacci = new CalculateFibonacci();
    }

    @Test
    void calculate() {
        long expectedResult = 75025L;

        assertThat(calculateFibonacci.execute(new NumberToCalculate(25)))
                .isEqualTo(expectedResult);
    }
}