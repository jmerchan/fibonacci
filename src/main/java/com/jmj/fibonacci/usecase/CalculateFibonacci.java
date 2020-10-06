package com.jmj.fibonacci.usecase;

import com.jmj.fibonacci.domain.NumberToCalculate;
import org.springframework.stereotype.Component;

@Component
public class CalculateFibonacci {
    public Long execute(NumberToCalculate numberToCalculate){
        throw new UnsupportedOperationException();
    }
}
