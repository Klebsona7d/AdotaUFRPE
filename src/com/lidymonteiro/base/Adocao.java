package com.lidymonteiro.base;
import java.util.Date;

public class Adocao {
	private boolean status;
	private String descricao;
	private Date data;
	
	public Adocao() {
		System.out.println("Objeto da classe Adocao instanciado com sucesso!");
	}
	
	public boolean getStatus(){
		return this.status;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public Date getData(){
		return this.data;
	}
	
	public void setStatus(boolean status){
		this.status = status;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public void setData(Date data){
		this.data = data;
	}
}