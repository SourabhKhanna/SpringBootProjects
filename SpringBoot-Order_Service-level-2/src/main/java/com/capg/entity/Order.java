package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Entity @AllArgsConstructor @NoArgsConstructor
@Table(name = "ORDER_TB")
public class Order {

	@Id
	private int id;
	private String name;
	private int qty;
	private int price;
	
}
