package com.springcoding.internalWorkingOfSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class PhonePayPaymentService implements PaymentService {

    @Override
    public String pay(){
        System.out.println("Payment from PhonePay Payment Service");
        return "Payment from PhonePay Payment Service";
    }
}