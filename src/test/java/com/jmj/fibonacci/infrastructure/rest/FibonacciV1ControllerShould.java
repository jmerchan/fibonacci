package com.jmj.fibonacci.infrastructure.rest;

import com.jmj.fibonacci.domain.NumberToCalculate;
import com.jmj.fibonacci.infrastructure.rest.dto.ResultV1DTO;
import com.jmj.fibonacci.infrastructure.rest.mapper.LongToResultV1DTOMapper;
import com.jmj.fibonacci.usecase.CalculateFibonacci;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class FibonacciV1ControllerShould {

    private FibonacciV1Controller fibonacciV1Controller;

    @Mock
    private CalculateFibonacci calculateFibonacci;
    @Mock
    private LongToResultV1DTOMapper longToResultV1DTOMapper;

    @BeforeEach
    void setUp() {
        fibonacciV1Controller = new FibonacciV1Controller(calculateFibonacci, longToResultV1DTOMapper);
    }

    @Test
    void calculate() {
        NumberToCalculate numberToCalculate = new NumberToCalculate(10L);
        ResultV1DTO expectedResult = new ResultV1DTO(55L);

        given(calculateFibonacci.execute(numberToCalculate)).willReturn(55L);
        given(longToResultV1DTOMapper.map(55L)).willReturn(new ResultV1DTO(55L));

        ResultV1DTO calculate = fibonacciV1Controller.calculate(10L);

        assertThat(calculate)
                .isEqualTo(expectedResult);

    }
}