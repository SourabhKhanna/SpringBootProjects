package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.common.Payment;
import com.capg.common.TransactionRequest;
import com.capg.common.TransactionResponse;
import com.capg.entity.Order;
import com.capg.repository.OrderRepository;


@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	@Autowired
	private RestTemplate template;
	
	
	public TransactionResponse saveOrder(TransactionRequest request)
	{
		String response="";
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		
		
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		
		repository.save(order);
		//rest call
		Payment paymentResponse = template.postForObject("http://localhost:9191/payment/doPayment", payment, Payment.class);
		
		
		
		response = paymentResponse.getPaymentStatus().equals("Success")?"payment processing successfull and order placed":"there is a failure in payment api, order added to cart";
		
		return new TransactionResponse(order, paymentResponse.getTransactionId(), paymentResponse.getAmount(), response);
		
		
	}

}