package com.jmj.fibonacci.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class NumberToCalculateShould {

    @Test
    void require_a_value() {
        Throwable throwable = catchThrowable(() -> new NumberToCalculate(null));

        assertThat(throwable)
                .isNotNull()
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The value must be informed");
    }
}