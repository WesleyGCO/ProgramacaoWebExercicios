package MassaCorporal;

public class Pessoa {
	
	private char sexo;
	private Double peso;
	private Double altura;
	
	public Pessoa() {
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double calcularImc() {
		return (this.peso / Math.pow(this.altura, 2));
	}
	
	public String situacaoImc() {
		ImcConstantesPeso constante = new ImcConstantesPeso(sexo);
		if (calcularImc() < constante.getAbaixoDoPeso()) {
			return "Você está abaixo do peso";
		}
		
		else if (calcularImc() < constante.getPesoNormal()) {
			return "Você está no peso normal";
		}
		
		else if (calcularImc() < constante.getMarginalmenteAcimaPeso()) {
			return "Você está marginalmente acima do peso";
		}
		
		else if (calcularImc() < constante.getAcimaDoPesoIdeal()) {
			return "Você está acima do peso ideal";
		}
		
		else {
			return "Você está OBESO";
		}
	}
	
	/*public String definirImc() {
		
		Double imc = calcularImc();
		
		if (this.sexo == "F") {
			if (imc < 19.1) {
				return "Você está abaixo do peso";
			}
			
			else if (imc <= 25.8) {
				return "Você está no peso normal";
			}
			
			else if (imc <= 27.3) {
				return "Você está marginalmente acima do peso";
			}
			
			else if (imc <= 32.3) {
				return "Você está acima do peso ideal";
			}
			
			else {
				return "Você está OBESO";
			}
		}
		
		else {
			if (imc < 20.7) {
				return "Você está abaixo do peso";
			}
			
			else if (imc <= 26.4) {
				return "Você está no peso normal";
			}
			
			else if (imc <= 27.8) {
				return "Você está marginalmente acima do peso";
			}
			
			else if (imc <= 31.1) {
				return "Você está acima do peso ideal";
			}
			
			else {
				return "Você está OBESO";
			}
		}*/
	}
