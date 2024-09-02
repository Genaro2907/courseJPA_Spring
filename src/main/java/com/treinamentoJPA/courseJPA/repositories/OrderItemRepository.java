package com.treinamentoJPA.courseJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoJPA.courseJPA.entities.OrderItem;
import com.treinamentoJPA.courseJPA.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}
