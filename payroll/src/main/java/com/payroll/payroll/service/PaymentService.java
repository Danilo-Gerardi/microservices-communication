package com.payroll.payroll.service;

import com.payroll.payroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment pay(Long id, Integer days) {
        return Payment.builder()
                .name("Danilo")
                .dailyIncome(200.0)
                .days(20)
                .build();
    }

}
