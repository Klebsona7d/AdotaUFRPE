package com.lidymonteiro.base;
public class Pessoa {
	private String login;
	private String senha;
	private String email;
	// Construtor da classe Pessoa
	public Pessoa() {
		System.out.printf("Objeto da classe Pessoa instanciado com sucesso!\n");
	}

        public Pessoa(String login, String senha, String email) {
            this.login = login;
            this.senha = senha;
            this.email = email;
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

    @Override
    public String toString() {
        return String.format("(%s ,%s)", this.email,this.login); //To change body of generated methods, choose Tools | Templates.
    }
        
		
}