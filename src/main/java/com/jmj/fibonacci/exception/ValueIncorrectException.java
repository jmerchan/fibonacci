package com.jmj.fibonacci.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValueIncorrectException extends RuntimeException {
    public ValueIncorrectException(String message) {
        super(message);
    }
}
