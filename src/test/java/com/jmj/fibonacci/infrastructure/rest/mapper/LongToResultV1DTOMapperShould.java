package com.jmj.fibonacci.infrastructure.rest.mapper;

import com.jmj.fibonacci.infrastructure.rest.dto.ResultV1DTO;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongToResultV1DTOMapperShould {

    private static final long TEN = 10L;

    @Test
    void map() {
        LongToResultV1DTOMapper longToResultV1DTOMapper = new LongToResultV1DTOMapper();
        ResultV1DTO expectedResultV1DTO = new ResultV1DTO(10L);

        assertThat(longToResultV1DTOMapper.map(TEN))
                .isEqualTo(expectedResultV1DTO);
    }
}