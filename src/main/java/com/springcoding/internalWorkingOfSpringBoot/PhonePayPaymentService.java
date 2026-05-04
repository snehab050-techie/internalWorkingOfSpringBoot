package com.springcoding.internalWorkingOfSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class PhonePayPaymentService{

    public String phonePayPayment(){
        System.out.println("Payment from PhonePay Payment Service");
        return "Payment from PhonePay Payment Service";
    }
}