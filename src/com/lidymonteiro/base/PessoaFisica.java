package com.lidymonteiro.base;
import java.util.Date;

public class PessoaFisica extends Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	private Date dataNascimento;
	
	public PessoaFisica() {
		System.out.println("Objeto da classe PessoaFisica instanciado com sucesso!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}