package utilitario;

import javax.swing.JOptionPane;

public class IdadePessoa {
	public static void main(String[] args) {
		
		String idadeString = JOptionPane.showInputDialog ("Digite a idade");
		Integer idade = Integer.parseInt(idadeString);
		
		System.out.println(idade);
		
		if (idade <= 12) {
			System.out.println("Você é uma criança!");
		}
		else if (idade <= 17) {
			System.out.println("Você é um adolescente!");
		}
		else if (idade <= 59) {
			System.out.println("Você é um adulto!");
		}
		else if (idade > 59) {
			System.out.println("Você é um idoso!");
		}
	}
}
