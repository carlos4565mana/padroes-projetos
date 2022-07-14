package com.carlos.padroesprojetosspring.service;

import com.carlos.padroesprojetosspring.model.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
