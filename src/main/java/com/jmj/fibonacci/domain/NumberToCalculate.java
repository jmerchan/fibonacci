package com.jmj.fibonacci.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@ToString
@EqualsAndHashCode
@Getter
public class NumberToCalculate {
    private Long value;

    public NumberToCalculate(Long value) {
        this.value = value;
        if (Objects.isNull(value)) throw new IllegalArgumentException("The value must be informed");
    }
}
