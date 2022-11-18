package com.capg.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Payment;
import com.capg.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repository;
	
	public Payment doPayment(Payment payment)
	{
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}
	
	public String paymentProcessing()
	{
		return new Random().nextBoolean()?"Success":"Failure";
	}

}