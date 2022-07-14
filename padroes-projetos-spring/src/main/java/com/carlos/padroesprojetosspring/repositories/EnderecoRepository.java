package com.carlos.padroesprojetosspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.padroesprojetosspring.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String>{

}
