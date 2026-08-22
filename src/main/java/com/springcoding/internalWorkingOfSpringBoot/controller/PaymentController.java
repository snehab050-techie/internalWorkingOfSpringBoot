package com.springcoding.internalWorkingOfSpringBoot.controller;

import com.springcoding.internalWorkingOfSpringBoot.Entity.PaymentEntity;
import com.springcoding.internalWorkingOfSpringBoot.service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping
    public void postPayment(PaymentEntity i){
        paymentService.pay(i);
    }
}
