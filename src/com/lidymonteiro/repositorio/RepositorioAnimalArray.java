package com.lidymonteiro.repositorio;
import com.lidymonteiro.base.Animal;

public class RepositorioAnimalArray implements IRepositorioAnimal {
	
	private Animal[] animais; 
	private int indice;
	private final static int TAMANHO = 100;
	
	public RepositorioAnimalArray(){
		this.animais = new Animal[TAMANHO];
		this.indice = 0;
	}
	/*
	if(codigo == animais[indice].getCodigo()){
		return true;
	}
	return false;
	*/
	
	
	/*public boolean existeAluno(String cpf){
		if(cpf == alunos[indice].getCpf()){
			return true;
		}
		return false;
	}
	
	*/
	
	/*
	 
	public boolean contains(int elemento){  
        for (int num : a)  {
               if(num==elemento){  
                   return true;
               }
        }
        return false;
    }
	  */

	public boolean existeAnimal(String codigo){
		for(Animal aux : animais) {
			if (codigo == aux.getCodigo()) {
				return true;
			}
		}
		return false;
	}
	

	@Override
	public Animal procurar(String codigo) {
		if(existeAnimal(codigo) == true){
			if(codigo == animais[indice].getCodigo()){
				
			}
		}
		
		
		return null;
	}
	
/*
	
	public boolean existeAluno(String cpf){

		if(cpf == alunos[indice].getCpf()){
			return true;
		}
		return false;
	}
	

	public Aluno procurarAluno(String cpf){

		if(existeAluno(cpf) == true){
			for(; indice >= 0 ; this.indice--){
				if( cpf == alunos[indice].getCpf()){

					return this.alunos[indice];		
				}
			}
		}
		return null;
	}
	
	
	*/
	

	
	
	
	@Override
	public void inserir(Animal animais) {
			this.animais[indice] = animais;
			this.indice = this.indice + 1;
	}
		

	@Override
	public void remover(String codigo) {
	
		// procurar no array o animal que tem determinado codigo e excluir
		//this.animais[indice].getCodigo() = null;
		
	}

	@Override
	public void atualizar(Animal animais) {
		// usa o codigo para pesquisar o animal que deseja atualizar dentro do array e subtitui o objeto
		// TODO Auto-generated method stub
		
	}
	
	

}

