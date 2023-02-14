package MassaCorporal;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa mulher = new Pessoa();
		mulher.setSexo(JOptionPane.showInputDialog("Qual o seu sexo? Por favor, digite sendo F ou M:"));
		mulher.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Qual sua altura em metros?")));
		mulher.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Qual o seu peso?")));
		
		
		System.out.println(mulher.definirImc());
	}

}
