package FaixaEtaria;

public class Pessoa {
	private int idade;
	
	public Pessoa() {
	}
	
	public Pessoa(int idade) {
		idade = this.idade;
	}
	
	public String checarIdade() {
		if (idade <= 12) {
			return "Você é uma criança";
			//System.out.println("Você é uma criança!");
		}
		else if (idade <= 17) {
			return "Você é um adolescente";
		}
		else if (idade <= 59) {
			return "Você é um adulto";
		}
		else {
			return "Você é um idoso";
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
