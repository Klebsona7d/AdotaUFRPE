package com.lidymonteiro.base;
public class Adotante {
	
	private double rendaFamiliar;
	private boolean criancaNoLocal;
	private String tipoImovel;
	private String espacoImovel;
	private boolean possuiAnimais;
	private String reputacao;
	
	public Adotante() {
		System.out.println("Objeto da classe Adocao instanciado com sucesso!");
	}

	public double getRendaFamiliar() {
		return rendaFamiliar;
	}

	public void setRendaFamiliar(double rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}

	public boolean isCriancaNoLocal() {
		return criancaNoLocal;
	}

	public void setCriancaNoLocal(boolean criancaNoLocal) {
		this.criancaNoLocal = criancaNoLocal;
	}

	public String getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(String tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public String getEspacoImovel() {
		return espacoImovel;
	}

	public void setEspacoImovel(String espacoImovel) {
		this.espacoImovel = espacoImovel;
	}

	public boolean isPossuiAnimais() {
		return possuiAnimais;
	}

	public void setPossuiAnimais(boolean possuiAnimais) {
		this.possuiAnimais = possuiAnimais;
	}

	public String getReputacao() {
		return reputacao;
	}

	public void setReputacao(String reputacao) {
		this.reputacao = reputacao;
	}
	
	
	

}
