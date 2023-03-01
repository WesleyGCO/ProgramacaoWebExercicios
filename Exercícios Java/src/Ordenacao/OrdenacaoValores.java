package Ordenacao;

import javax.swing.JOptionPane;

public class OrdenacaoValores {

	public static void main(String[] args) {
		String valores = JOptionPane.showInputDialog("Digite 3 valores: ");
		
		String valoresArray[] = valores.split(";");
		int valoresInt[] = new int[valoresArray.length];
		
		for(int x = 0; x < valoresArray.length; x++) {
			valoresInt[x] = Integer.parseInt(valoresArray[x]);
		}
		
		int temp;
		
		if(valoresInt[0] > valoresInt[1]) {
			temp = valoresInt[0];
			valoresInt[0] = valoresInt[1];
			valoresInt[1] = temp;
		}
		
		if(valoresInt[1] > valoresInt[2]) {
			temp = valoresInt[1];
			valoresInt[1] = valoresInt[2];
			valoresInt[2] = temp;
		}
		
		if(valoresInt[0] > valoresInt[1]) {
			temp = valoresInt[0];
			valoresInt[0] = valoresInt[1];
			valoresInt[1] = temp;
		}
		
		System.out.println(valoresInt[0]+", " + valoresInt[1]+", " +valoresInt[2]);
	}
}
