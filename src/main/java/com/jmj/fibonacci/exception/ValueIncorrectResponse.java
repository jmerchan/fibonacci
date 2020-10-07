package com.jmj.fibonacci.exception;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class ValueIncorrectResponse {
    private String error;

    public ValueIncorrectResponse(String error) {
        this.error = error;
    }
}
