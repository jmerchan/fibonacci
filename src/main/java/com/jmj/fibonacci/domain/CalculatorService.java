package com.jmj.fibonacci.domain;

import javax.inject.Named;
import java.util.stream.Stream;

@Named
public class CalculatorService {
    public Long calculateFibonacci(NumberToCalculate numberToCalculate) {
        return Stream.iterate(new long[]{1, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(numberToCalculate.getValue())
                .reduce((a, b) -> b)
                .get()[0];
    }
}
