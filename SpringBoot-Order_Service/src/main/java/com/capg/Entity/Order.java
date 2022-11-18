package com.capg.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "ORDER_TB")
@Entity 
public class Order {
		@Id
		private int id;
		private String name;
		private int qty;
		private double price;
		
	}

