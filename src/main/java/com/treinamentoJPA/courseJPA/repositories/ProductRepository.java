package com.treinamentoJPA.courseJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoJPA.courseJPA.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
