package com.carlos.gof.facade.contabancaria;

public class Fachada {

	private ClienteDoBanco cliente;
	
	private ContaBancaria conta;

	public Fachada( ) {
		super();
		this.cliente = new ClienteDoBanco();
		this.conta = new ContaBancaria();
	}
	
	public void Depositar(int valor, ClienteDoBanco cliente, ContaBancaria conta ) {
		System.out.printf("Cliente %s\n",cliente.obterNomeDoCliente());
		System.out.printf("Conta %s\n",conta.obterNumConta());
		System.out.printf("Saldo =  %d\n",conta.obterSaldo());
		System.out.printf("Deposito R$ %s\n ",valor);
		conta.setSaldo(conta.getSaldo() + valor);
		System.out.printf("Depositado R$ %d na conta de %s\n",valor , cliente.obterNomeDoCliente());
		System.out.printf("O saldo desta conta é: R$ %s\n", conta.obterSaldo());
		
		
	
	}

	public ClienteDoBanco getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDoBanco cliente) {
		this.cliente = cliente;
	}

	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
	
	
}
