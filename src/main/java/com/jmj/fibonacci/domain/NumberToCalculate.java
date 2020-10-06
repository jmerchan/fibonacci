package com.jmj.fibonacci.domain;

import com.jmj.fibonacci.exception.ValueIncorrectException;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@ToString
@EqualsAndHashCode
@Getter
public class NumberToCalculate {
    private final Integer value;

    public NumberToCalculate(Integer value) {
        this.value = value;
        if (Objects.isNull(value)) throw new ValueIncorrectException("The value must be informed");
        if (value < 0) throw new ValueIncorrectException("The value must be greater than zero");
        if (value > 92) throw new ValueIncorrectException("The system only can calculate values between (0-92)");
    }
}
