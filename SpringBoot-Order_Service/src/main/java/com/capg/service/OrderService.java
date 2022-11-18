package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Entity.Order;
import com.capg.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public Order saveOrder(Order order)
	{
		System.out.println(order.getId()+"Inserted into database successfully");
		return repository.save(order);
		
	}
	
	public Order getOrderId(int id) {		
		if(repository.findById(id).isPresent()) {
			Order order=repository.getById(id);
			return order;
		}
		else
			return null;
	}

}
