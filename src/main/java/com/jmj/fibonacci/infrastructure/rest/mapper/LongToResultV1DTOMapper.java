package com.jmj.fibonacci.infrastructure.rest.mapper;

import com.jmj.fibonacci.infrastructure.rest.dto.ResultV1DTO;
import org.springframework.stereotype.Component;

@Component
public class LongToResultV1DTOMapper {
    public ResultV1DTO map (Long value){
        return new ResultV1DTO(value);
    }
}
