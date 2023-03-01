package FaixaEtaria;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//String idadeString = JOptionPane.showInputDialog ("Digite a idade");
		//Integer idade = Integer.parseInt(idadeString);
		
		Pessoa pessoa1 =  new Pessoa();
		pessoa1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")));

		pessoa1.checarIdade();
	}

}
