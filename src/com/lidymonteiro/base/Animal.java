package com.lidymonteiro.base;

import static java.sql.JDBCType.NULL;
import java.util.ArrayList;

public class Animal {
   
   private String codigo;
   private String nome;
   private int idade;
   private String raca;
   private String cor;
   private String especie;
   private double tamanho;
   private double peso;
   private String porte;
   private String pelagem;
   private String local;
   private String foto;
   private String biografia;
   ArrayList<Endereco> locaisPossivel= new ArrayList<>();
  
   public Animal(){
	   System.out.println("Objeto da classe Animal instanciado com sucesso!"); 
   }

	
	public String getCodigo() {
		return codigo;
	}

  
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public String getRaca() {
		return raca;
	}
	
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	public String getCor() {
		return cor;
	}
	
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public String getEspecie() {
		return especie;
	}
	
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	public double getTamanho() {
		return tamanho;
	}
	
	
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	
	public double getPeso() {
		return peso;
	}
	
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public String getPorte() {
		return porte;
	}
	
	
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	
	public String getPelagem() {
		return pelagem;
	}
	
	
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	
	public String getLocal() {
		return local;
	}
	
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	
	public String getFoto() {
		return foto;
	}
	
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	public String getBiografia() {
		return biografia;
	}
	
	
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
        public Endereco getLocaisPossivel(int x) {
            if (locaisPossivel.isEmpty()) {
                return null;
            }
            else{
                return locaisPossivel.get(x);
            }
        }
        public void setLocaisPossivel(Endereco x)
        {
            this.locaisPossivel.add(x);
        }
          
        
	
public boolean existeAnimal(String codigo, Animal[] animais){

	for (Animal animai : animais) {
		if(codigo == animai.getCodigo()){
			return true;
		}
		
	}
	return false;
	
}
   

   
}	