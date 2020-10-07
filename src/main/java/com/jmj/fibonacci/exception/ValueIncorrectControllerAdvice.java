package com.jmj.fibonacci.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ValueIncorrectControllerAdvice {
    @ExceptionHandler(ValueIncorrectException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValueIncorrectResponse handleValueIncorrectException(ValueIncorrectException valueIncorrectException) {
        return new ValueIncorrectResponse(valueIncorrectException.getMessage());
    }
}
