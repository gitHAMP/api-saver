package com.example.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(description = "Class representing a Outcome Response to be processed")
public class OutcomeResponse {
    private Long outcomeId;
    private String detail;
    private BigDecimal amount;
    private Date createdAt;
    private Date updatedAt;
}
