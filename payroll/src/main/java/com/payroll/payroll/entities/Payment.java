package com.payroll.payroll.entities;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public double total() {
        return days * dailyIncome;
    }
}
