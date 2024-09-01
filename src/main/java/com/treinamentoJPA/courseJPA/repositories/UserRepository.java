package com.treinamentoJPA.courseJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoJPA.courseJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
