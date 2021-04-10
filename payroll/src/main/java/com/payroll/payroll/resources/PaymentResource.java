package com.payroll.payroll.resources;

import com.payroll.payroll.entities.Payment;
import com.payroll.payroll.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentResource {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{workerId}/days/{days}")
    public ResponseEntity<Payment> payWorker(
            @PathVariable Long workerId,
            @PathVariable Integer days
    ) {
        Payment payment = this.paymentService.pay(workerId, days);

        return ResponseEntity.ok(payment);
    }


}
