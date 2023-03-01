package MassaCorporal;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa mulher = new Pessoa();
		mulher.setSexo(JOptionPane.showInputDialog("Digite o seu sexo - F ou M: ").charAt(0));
		mulher.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura em metros?")));
		mulher.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso?")));
		
		
		System.out.println(mulher.situacaoImc());
	}

}
