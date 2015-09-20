package br.com.boamorte;

public class Cliente {

	private String nome;
	private int idade;
	private long matricula =  0;
	private int qtdeDependente = 0;
	private double valorMensalidade;
	
	Dependente[] dependentes = new Dependente[3];
	
	public Cliente(String nome, int idade) {

		// Validando nome !!

		if (nome == null || nome.equals("")) {

			this.nome = "(sem nome)";
		} else {

			this.nome = nome;
		}

		// Validando idade!!

		if (idade < 0) {

			this.idade = 66;
		} else {

			this.idade = idade;
		}
		
		matricula ++;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public long getMatricula() {
		return matricula;
	}

	public int getQtdeDependentes() {
		
		return qtdeDependente;
	}

	public boolean adicionarDependente(Dependente dep1) {
		boolean confirma = false;
		if (qtdeDependente >= 3){
			
			return confirma = false;
		}
		
		if(qtdeDependente == 0){ 
			
			dependentes[qtdeDependente] = dep1;
			qtdeDependente ++;
			return confirma = true;
		
		}else{
			
			for(int i = 0 ; i < qtdeDependente ; i ++){
				
				if(dependentes[i].getNome().equals(dep1.getNome()) &&  dependentes[i].getIdade() == dep1.getIdade()){
				
				return confirma = false;
				
				} else{
					
					dependentes[qtdeDependente] = dep1;
					qtdeDependente ++;
					return confirma = true;
				}
			}
		}
		return confirma;
	}

	public double getValorMensalidade() {
		
		
		if(idade<30){
			
			valorMensalidade = 500.00;
			
		}else if(idade < 40){
			
			valorMensalidade = 600.00;
		}else if(idade < 50){
			
			valorMensalidade = 700.00;
		}else{
			
			valorMensalidade = 1500.00;
		}
		
		if(qtdeDependente != 0){
			
			for(int i = 0; i < qtdeDependente ; i++){
				
				if(dependentes[i].getIdade() < 30){
					
					valorMensalidade += 250.00;
				}else if(dependentes[i].getIdade() < 40){
					
					valorMensalidade += 300.00;
				}else if(dependentes[i].getIdade() < 50){
					valorMensalidade += 350.00;
					
				}else{
					valorMensalidade += 7500.00;
				}
			}
			
		}
		
		return valorMensalidade ;
	}

}
