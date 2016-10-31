package com.lidymonteiro.base;
public class PessoaJuridica extends Pessoa {
	
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	
	public PessoaJuridica() {
		System.out.println("Objeto da classe PessoaJuridica instanciado com sucesso!");
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}