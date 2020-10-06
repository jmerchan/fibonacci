package com.jmj.fibonacci.acceptance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class GetFibonacciCalculateNumberIT {
    private static final String EXPECTED_USER_JSON = "{\"result\":55}";
    private static final Integer TEN = 10;

    @Autowired
    MockMvc mockMvc;

    @Test
    void should_calculate() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/v1/fibonacci/calculate/{number}", TEN)
                        .accept(APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(EXPECTED_USER_JSON))
        ;
    }
}

