package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Entity.Payment;
import com.capg.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository repository;
	
	public Payment doPayment(Payment payment) {
		
		return repository.save(payment);
		
	}

}
