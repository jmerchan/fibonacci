package com.jmj.fibonacci.domain;

import com.jmj.fibonacci.exception.ValueIncorrectException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class NumberToCalculateShould {

    //This is the maximum value that can be calculated with long variables.
    private static final Integer MAXIM_VALUE = 93;

    @Test
    void require_a_value() {
        Throwable throwable = catchThrowable(() -> new NumberToCalculate(null));

        assertThat(throwable)
                .isNotNull()
                .isInstanceOf(ValueIncorrectException.class)
                .hasMessage("The value must be informed");
    }

    @Test
    void require_a_positive_value() {
        Throwable throwable = catchThrowable(() -> new NumberToCalculate(-1));

        assertThat(throwable)
                .isNotNull()
                .isInstanceOf(ValueIncorrectException.class)
                .hasMessage("The value must be greater than zero");
    }

    @Test
    void require_a_value_that_can_be_calculated_with_longs() {
        Throwable throwable = catchThrowable(() -> new NumberToCalculate(MAXIM_VALUE));

        assertThat(throwable)
                .isNotNull()
                .isInstanceOf(ValueIncorrectException.class)
                .hasMessage("The system only can calculate values between (0-92)");
    }
}