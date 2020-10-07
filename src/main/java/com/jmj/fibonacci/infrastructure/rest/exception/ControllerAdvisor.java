package com.jmj.fibonacci.infrastructure.rest.exception;

import com.jmj.fibonacci.exception.ValueIncorrectException;
import com.jmj.fibonacci.exception.ValueIncorrectResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerAdvisor {
    @ExceptionHandler(ValueIncorrectException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValueIncorrectResponse handleValueIncorrectException(ValueIncorrectException valueIncorrectException) {
        return new ValueIncorrectResponse(valueIncorrectException.getMessage());
    }
}
