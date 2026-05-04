package com.springcoding.internalWorkingOfSpringBoot;
import org.springframework.stereotype.Component;

@Component //to make this class a spring bean and to be managed by spring container
public class GpayPaymentService implements PaymentService {

    @Override
    public String pay(){
        System.out.println("Payment from GPay Payment Service");
        return "Payment from GPay Payment Service";
    }
}