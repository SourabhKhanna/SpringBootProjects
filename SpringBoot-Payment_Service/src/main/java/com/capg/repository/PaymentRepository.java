package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
