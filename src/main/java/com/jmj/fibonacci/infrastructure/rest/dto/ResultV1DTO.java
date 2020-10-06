package com.jmj.fibonacci.infrastructure.rest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
public class ResultV1DTO {

    @JsonProperty("result")
    private Integer result;

    @JsonCreator
    public ResultV1DTO(@JsonProperty("result") Integer result) {
        this.result = result;
    }
}
