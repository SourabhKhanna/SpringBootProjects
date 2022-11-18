package com.capg.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Entity.Order;

import com.capg.service.OrderService;
@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	public OrderService service;
	
	@PostMapping("/bookOrder")
	public Order bookOrder(@RequestBody Order order)
	{
		return service.saveOrder(order);
		
	}
	
	@GetMapping("/getOrder/{orderId}")
	public ResponseEntity<Order>  getName(@PathVariable int id){
		return new ResponseEntity<Order>(service.getOrderId(id), HttpStatus.OK);
		
		
	}

}
