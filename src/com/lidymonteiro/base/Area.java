package com.lidymonteiro.base;
public class Area {
	private String nome;
	private double latitude;
	private double longitute;
	private TipoArea tipoarea;
	
	public Area() {
		System.out.println("Objeto da classe Area instanciado com sucesso!");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	
	public double getLongitute() {
		return this.longitute;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public void setLongitute(double longitude) {
		this.longitute = longitude;
	}

	public TipoArea getTipoarea() {
		return tipoarea;
	}

	public void setTipoarea(TipoArea tipoarea) {
		this.tipoarea = tipoarea;
	}
	

}