package MassaCorporal;

public class Pessoa {
	
	private String sexo;
	private float peso;
	private float altura;
	
	public Pessoa() {
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularImc() {
		float valorFinal = (float) (this.peso / Math.pow(this.altura, 2));
		
		return valorFinal;
	}
	
	public String definirImc() {
		
		float imc = calcularImc();
		
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
		}
	}
	
}
