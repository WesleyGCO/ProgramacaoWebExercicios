package FolhaDePagamento;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		FolhaDePagamento pessoa1 = new FolhaDePagamento();
		pessoa1.setHoras(Float.parseFloat(JOptionPane.showInputDialog("Digite as suas horas trabalhadas no mês: ")));
		pessoa1.setValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da sua hora: ")));
		
		System.out.printf("Salário Bruto: ", pessoa1.calcularSalarioBruto() + "\nIR: ", pessoa1.calcularImpostoRenda() + "\nFGTS: ", pessoa1.calcularFgts() + "\nTotal de descontos: ", pessoa1.calcularDescontos() + "\nSalário Líquido: ", pessoa1.definirSalarioLiquido());
		

	}

}
