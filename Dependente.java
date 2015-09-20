package br.com.boamorte;

public class Dependente {

	private String nome;
	private int idade;

	public Dependente(String nome, int idade){
		
		if(nome == null || nome.equals("")){
			
			this.nome = "(sem nome)";
		}else{
			
			this.nome = nome;
		}
		
		if(idade < 0 ){
			
			this.idade = 66;
		}else{
			
			this.idade = idade;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	
}
