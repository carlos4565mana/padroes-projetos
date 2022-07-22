package com.carlos.gof.builder;

public class Cliente {

	private int codido;
	private String nome;
	private String telefone;
	
	
	public int getCodido() {
		return codido;
	}
	
	public void setCodido(int codido) {
		this.codido = codido;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [codido=" + codido + ", nome=" + nome + ", telefone=" + telefone + "]";
	}
	
	
	
}
