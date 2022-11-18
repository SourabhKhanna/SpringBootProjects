package com.capg.common;

import javax.persistence.criteria.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class TransactionResponse {

	 private Order order;
	 private String transactionId;
	 private int amount;
	 private String message;
	 
}