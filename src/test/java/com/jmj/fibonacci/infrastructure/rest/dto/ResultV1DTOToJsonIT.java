package com.jmj.fibonacci.infrastructure.rest.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ResultV1DTOToJsonIT {

    private static final int FIVE = 5;

    @Spy
    private ObjectMapper objectMapper;

    @Test
    void serialize() throws IOException {
        String expectedResponse = "{\"result\":5}";
        ResultV1DTO resultV1DTO = new ResultV1DTO(FIVE);

        String result = objectMapper.writeValueAsString(resultV1DTO);

        assertThat(result)
                .isNotEmpty()
                .isEqualTo(expectedResponse);
    }
}