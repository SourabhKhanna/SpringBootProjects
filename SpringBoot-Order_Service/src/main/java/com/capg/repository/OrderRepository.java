package com.capg.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.Entity.Order;
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
