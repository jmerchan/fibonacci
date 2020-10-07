package com.jmj.fibonacci.usecase;

import com.jmj.fibonacci.domain.CalculatorService;
import com.jmj.fibonacci.domain.NumberToCalculate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class CalculateFibonacciShould {

    private CalculateFibonacci calculateFibonacci;

    @Mock
    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculateFibonacci = new CalculateFibonacci(calculatorService);
    }

    @Test
    void calculate() {
        long expectedResult = 75025L;
        NumberToCalculate numberToCalculate = new NumberToCalculate(25);

        given(calculateFibonacci.execute(numberToCalculate))
                .willReturn(75025L);

        assertThat(calculateFibonacci.execute(new NumberToCalculate(25)))
                .isEqualTo(expectedResult);
    }
}