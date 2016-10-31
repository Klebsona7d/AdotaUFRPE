package com.lidymonteiro.base;
public class Pessoa {
	private String login;
	private String senha;
	private String email;
	
	// Construtor da classe Pessoa
	public Pessoa() {
		System.out.println("Objeto da classe Pessoa instanciado com sucesso!");
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
		
}