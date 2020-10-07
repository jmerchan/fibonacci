package com.jmj.fibonacci.infrastructure.rest;

import com.jmj.fibonacci.domain.NumberToCalculate;
import com.jmj.fibonacci.exception.ValueIncorrectException;
import com.jmj.fibonacci.infrastructure.rest.dto.ResultV1DTO;
import com.jmj.fibonacci.infrastructure.rest.mapper.LongToResultV1DTOMapper;
import com.jmj.fibonacci.usecase.CalculateFibonacci;
import org.assertj.core.api.Assertions;
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
        NumberToCalculate numberToCalculate = new NumberToCalculate(10);
        ResultV1DTO expectedResult = new ResultV1DTO(55L);

        given(calculateFibonacci.execute(numberToCalculate)).willReturn(55L);
        given(longToResultV1DTOMapper.map(55L)).willReturn(new ResultV1DTO(55L));

        ResultV1DTO calculate = fibonacciV1Controller.calculate("10");

        assertThat(calculate)
                .isEqualTo(expectedResult);

    }

    @Test
    void fail_when_no_number_is_given() {

        Throwable throwable = Assertions.catchThrowable(() -> fibonacciV1Controller.calculate("zztop"));

        assertThat(throwable)
                .isNotNull()
                .isInstanceOf(ValueIncorrectException.class)
                .hasMessage("The value must be number");
    }
}