package com.carlos.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
	
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		CrmService.gravar(nome, cep, cidade, estado);
	}
}
