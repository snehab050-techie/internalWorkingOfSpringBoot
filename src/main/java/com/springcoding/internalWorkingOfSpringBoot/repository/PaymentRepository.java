package com.springcoding.internalWorkingOfSpringBoot.repository;

import com.springcoding.internalWorkingOfSpringBoot.Entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Integer, PaymentEntity> {
}
