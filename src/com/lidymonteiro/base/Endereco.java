package com.lidymonteiro.base;
public class Endereco {
	private String rua;
	private String bairro;
	private String complemento;
	private Cidade cidade;
	private int numero;
	private String cep;
	private String celular;
	private String telefone;

	
	public Endereco() {
		System.out.println("Objeto da classe Endereco instanciado com sucesso!");
	}

        public Endereco(String rua, String bairro, String complemento, Cidade cidade, int numero, String cep, String celular, String telefone) {
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
        this.celular = celular;
        this.telefone = telefone;
        }
        
        public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public Cidade getCidade() {
		return cidade;
	}


	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}

