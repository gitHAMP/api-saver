package com.example.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;


@Data
@Entity
@Table(name="outcomes")
public class Outcome extends   CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "detail")
    private String detail;
    @Column(name = "amount")
    private BigDecimal amount;


}
