package com.lidymonteiro.base;

public class Programa {

	public static void main(String[] args) {

		Animal cachorro = new Animal();
		cachorro.setNome("Tedinho!");
		cachorro.setCodigo("AC9001");
		//System.out.println(cachorro.getNome());
		//System.out.println(cachorro.getCodigo());
		
		Animal cachorro2 = new Animal();
		cachorro.setNome("Pixoto");
		cachorro.setCodigo("TD4201");
		
		Animal[] animais = new Animal[3];
		animais[0] = cachorro;
		animais[1] = cachorro2;
		
		String codigo = "AC9001";
		
		//System.out.println(animais.length());
		
		for(int i=0; i< animais.length; i++){
			System.out.println(animais[i].getCodigo());
		}
		
		for (Animal animai : animais) {
			if(codigo == animai.getCodigo()){
				System.out.println("Existe!");
			}
		}
		
		

		
		/* 
		 * 
		 * if(codigo == animais[i].getCodigo()){
				System.out.println("Existe!");
				break;
			}
			else {
				System.out.println("Nao Existe!");
			}
		 * 
		 */
		
 	
		/*
		for(Animal aux : animais) {
			if (codigo == aux.getCodigo()) {
				System.out.println("Existe!");
				System.out.println(aux.getNome());
			}
		}
		*/
		
		
		
	
		/*
		PessoaFisica voluntaria = new PessoaFisica();
		voluntaria.setRg("231233-0");
		System.out.println(voluntaria.getRg());
		
		Area area = new Area();
		
		area.setLatitude(212.3);
		area.setLongitute(11.2);
		area.setNome("CEGOE");
		
		TipoArea tipo1 = new TipoArea();
		tipo1.setNome("Abandono");
		tipo1.setCodigo("B71");
		
		area.setTipoarea(tipo1);
		
		System.out.println("Nome: " + area.getNome());
		System.out.print("Tipo: " + area.getTipoarea().getNome());
		
		
		Endereco end = new Endereco();
		end.setRua("Rua da Luz");
		end.setBairro("Casa Amarela");
		
		Cidade cidade = new Cidade();
		cidade.setNome("Recife");
		cidade.setUf("PE");
		
		end.setCidade(cidade);
		
		System.out.println("Nome: " + end.getRua());
		System.out.println("Cidade: " + end.getCidade().getNome());
		System.out.println("UF: " + end.getCidade().getUf());
		
		*/

	
	}
}

		




