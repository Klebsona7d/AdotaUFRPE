package com.lidymonteiro.base;
public class Cidade {
	private String nome;
	private String uf;
	
	public Cidade() {
		System.out.println("Objeto da classe Cidade instanciado com sucesso!");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getUf() {
		return this.uf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
}