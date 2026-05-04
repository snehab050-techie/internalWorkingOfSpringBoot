package com.springcoding.internalWorkingOfSpringBoot;

import org.springframework.stereotype.Component;

// @Component - to make this class a spring bean and to be managed by spring container
public class PhonePayPaymentService implements PaymentService {

    @Override
    public String pay(){
        System.out.println("Payment from PhonePay Payment Service");
        return "Payment from PhonePay Payment Service";
    }
}