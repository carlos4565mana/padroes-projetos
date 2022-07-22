package com.carlos.padroesprojetosspring.service;

import com.carlos.padroesprojetosspring.model.Cliente;
/**
 * 
 * Interface que define o padrão Strategy do domínio cliente.
 *isso, se necessario, podemos ter multiplas implementaçõees dessa mesma interface.
 */
public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
