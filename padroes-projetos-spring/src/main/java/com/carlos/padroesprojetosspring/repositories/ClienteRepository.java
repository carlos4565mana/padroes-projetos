package com.carlos.padroesprojetosspring.repositories;

import org.springframework.stereotype.Repository;

import com.carlos.padroesprojetosspring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {

	
}
