package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.capg.entity.Customer;
import com.capg.repository.CustomerRepository;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		
CustomerRepository repo = context.getBean(CustomerRepository.class);
		
		Customer customer = new Customer();
		customer.setCustId(103);
		customer.setCustName("sourabh");
		repo.save(customer);
	}

}
