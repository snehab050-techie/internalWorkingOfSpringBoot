package com.springcoding.internalWorkingOfSpringBoot.repository;

import com.springcoding.internalWorkingOfSpringBoot.Entity.PaymentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public abstract class PaymentRepositoryImpl implements PaymentRepository{

    @Autowired
    public PaymentRepository paymentRepository;

    public void pay(Integer paymentEntity){
        paymentRepository.save(paymentEntity);
    }
}
