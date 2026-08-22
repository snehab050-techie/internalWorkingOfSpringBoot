package com.springcoding.internalWorkingOfSpringBoot.service;

import com.springcoding.internalWorkingOfSpringBoot.Entity.PaymentEntity;
import com.springcoding.internalWorkingOfSpringBoot.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public void pay(PaymentEntity paymentEntity){
       paymentRepository.save(123);
    }

}
