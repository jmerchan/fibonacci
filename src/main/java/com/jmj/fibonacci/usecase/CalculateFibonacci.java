package com.jmj.fibonacci.usecase;

import com.jmj.fibonacci.domain.NumberToCalculate;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class CalculateFibonacci {
    public Long execute(NumberToCalculate numberToCalculate){
        return Stream.iterate(new long[]{1, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(numberToCalculate.getValue())
                .reduce((a, b) -> b)
                .get()[0];
    }
}
