package com.carlos.padroesprojetosspring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.padroesprojetosspring.model.Cliente;
import com.carlos.padroesprojetosspring.model.Endereco;
import com.carlos.padroesprojetosspring.repositories.ClienteRepository;
import com.carlos.padroesprojetosspring.repositories.EnderecoRepository;
import com.carlos.padroesprojetosspring.service.ClienteService;
import com.carlos.padroesprojetosspring.service.ViaCepService;

/**
 * 
 * Implementação da Strategy
 * Injetada peloSpring (via Autowired)
 * Service será tratada como Singleton
 */
@Service
public class ClienteServiceImpl implements ClienteService{
	// Singleton: Injetar os componentes do Spring com @Autowired.
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ViaCepService viaCepService;
	
	
	// Strategy: Implementar os mÃ©todos definidos na interface.
	// Facade: Abstrair integraÃ§Ãµes com subsistemas, provendo uma interface simples.

	@Override
	public Iterable<Cliente> buscarTodos() {
		
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		
		Optional<Cliente> cliente = clienteRepository.findById(id);
		
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		
		salvarClienteComCep(cliente);
		
	}

	private void salvarClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
			
		});
		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
	}
	

	@Override
	public void atualizar(Long id, Cliente cliente) {
		
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if (clienteBd.isPresent()) {
			salvarClienteComCep(cliente);
		}
		
		
	}

	@Override
	public void deletar(Long id) {
		
		clienteRepository.deleteById(id);
		
		
	}

}
