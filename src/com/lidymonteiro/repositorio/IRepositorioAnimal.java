package com.lidymonteiro.repositorio;
import com.lidymonteiro.base.Animal;

public interface IRepositorioAnimal {
	public void inserir(Animal animal);
	public void remover (String codigo);
	public void atualizar(Animal animal);
	public Animal procurar(String codigo);
}
