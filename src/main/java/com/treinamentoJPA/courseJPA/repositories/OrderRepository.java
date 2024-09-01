package com.treinamentoJPA.courseJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoJPA.courseJPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
