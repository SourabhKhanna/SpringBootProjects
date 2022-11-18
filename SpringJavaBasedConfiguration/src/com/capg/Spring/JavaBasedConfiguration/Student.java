package com.capg.Spring.JavaBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Sourabh")
	private String stName;
	@Value("101")
    private String stid;
	
	@Autowired
	private Address address;
	
	public void display() {
		System.out.println(address);
	}
	
}

