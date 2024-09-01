package com.treinamentoJPA.courseJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoJPA.courseJPA.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
