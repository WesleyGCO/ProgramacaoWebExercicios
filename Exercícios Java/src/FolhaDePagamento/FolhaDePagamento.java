package FolhaDePagamento;

public class FolhaDePagamento {
	private float horas;
	private float valor;
		
	public FolhaDePagamento() {
	}

	public float getHoras() {
		return horas;
	}

	public void setHoras(float horas) {
		this.horas = horas;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public float calcularSalarioBruto() {
		float salarioBruto = this.horas * this.valor;
		
		return salarioBruto;
	}
	
	public float calcularImpostoRenda() {
		
		float salario = calcularSalarioBruto();
		
		if (salario <= 900) {
			return salario;
		}
		
		else if (salario <= 1500) {
			float descontoIr = (float) (salario * 0.05);
			
			return descontoIr;
		}
		
		else if (salario <= 2500) {
			float descontoIr = (float) (salario * 0.10);
			
			return descontoIr;
		}
		
		else {
			float descontoIr = (float) (salario * 0.20);
			
			return descontoIr;
		}
	}
	
	public float calcularFgts() {
		float fgts = (float) (calcularSalarioBruto() * 0.11);
		
		return fgts;
	}
	
	public float calcularInss() {
		float inss = (float) (calcularSalarioBruto() * 0.10);
		
		return inss;
	}
	
	public float calcularDescontos() {
		float totalDescontos = calcularImpostoRenda() + calcularInss();
		
		return totalDescontos;
	}
	
	public float definirSalarioLiquido() {
		
		float salarioLiquido = calcularSalarioBruto() - calcularDescontos();
		
		return salarioLiquido;
	}
}
