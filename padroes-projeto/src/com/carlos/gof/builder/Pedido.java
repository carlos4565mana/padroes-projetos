package com.carlos.gof.builder;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private String numeroPedido;
	
	private List<Produto> produtos;
	
	private Cliente cliente;
	
	private Vendedor vendedor;

	public void setNumeroPedido(String numeroPedido2) {
		this.numeroPedido = numeroPedido2;
		
	}

	public void setCliente(Cliente cliente2) {
		this.cliente = cliente2;
		
	}

	public void setVendedor(Vendedor vendedor2) {
		this.vendedor = vendedor2;
		
	}

	public Object getProdutos() {

		return produtos;
	}

	public void setProdutos(ArrayList arrayList) {
		this.produtos = arrayList;
		
	}
	
	


	
	
	

}
