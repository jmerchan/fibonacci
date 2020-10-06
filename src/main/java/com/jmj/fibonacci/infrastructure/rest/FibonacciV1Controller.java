package com.jmj.fibonacci.infrastructure.rest;

import com.jmj.fibonacci.infrastructure.rest.dto.ResultV1DTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/fibonacci")
public class FibonacciV1Controller {

    @GetMapping("/calculate/{number}")
    public ResultV1DTO calculate(
            @PathVariable(value = "number") Integer number
    ) {
        return new ResultV1DTO(5);
    }

}
