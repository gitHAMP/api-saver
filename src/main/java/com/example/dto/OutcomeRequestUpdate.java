package com.example.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@ApiModel(description = "Class representing a Outcome Request to be processed")
public class OutcomeRequestUpdate {

    @NotNull
    @ApiModelProperty(notes="Id",example ="1", required = true )
    private Long outcomeId;

    @NotBlank
    @NotNull
    @ApiModelProperty(notes="Detail",example ="Comida para mi perro", required = true )
    private String detail;

    @NotNull
    @ApiModelProperty(notes="Amount",example ="10", required = true )
    private BigDecimal amount;
}
