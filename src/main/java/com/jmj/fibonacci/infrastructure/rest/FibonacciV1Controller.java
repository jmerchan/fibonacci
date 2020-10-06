package com.jmj.fibonacci.infrastructure.rest;

import com.jmj.fibonacci.domain.NumberToCalculate;
import com.jmj.fibonacci.infrastructure.rest.dto.ResultV1DTO;
import com.jmj.fibonacci.infrastructure.rest.mapper.LongToResultV1DTOMapper;
import com.jmj.fibonacci.usecase.CalculateFibonacci;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/fibonacci", produces = MediaType.APPLICATION_JSON_VALUE)
public class FibonacciV1Controller {

    private CalculateFibonacci calculateFibonacci;
    private LongToResultV1DTOMapper longToResultV1DTOMapper;

    public FibonacciV1Controller(CalculateFibonacci calculateFibonacci,
                                 LongToResultV1DTOMapper longToResultV1DTOMapper) {
        this.calculateFibonacci = calculateFibonacci;
        this.longToResultV1DTOMapper = longToResultV1DTOMapper;
    }

    @GetMapping("/calculate/{value}")
    public ResultV1DTO calculate(
            @PathVariable(value = "value") int number
    ) {
        return longToResultV1DTOMapper.map(
                calculateFibonacci.execute(new NumberToCalculate(number))
        );
    }

}
