package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.common.Payment;
import com.capg.common.TransactionRequest;
import com.capg.common.TransactionResponse;
import com.capg.entity.Order;
import com.capg.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	public OrderService service;
	
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request)
	{
	
		return service.saveOrder(request);
	}
	

}
