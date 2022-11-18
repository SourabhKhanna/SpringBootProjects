package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Entity.Payment;
import com.capg.service.PaymentService;
@RestController
public class PaymentController {
	@Autowired
	private PaymentService service;
	
	
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment) {
		
		return service.doPayment(payment);
		
	}

}
