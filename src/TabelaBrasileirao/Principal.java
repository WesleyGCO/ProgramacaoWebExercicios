package TabelaBrasileirao;

public class Principal {

	public static void main(String[] args) {
		
		Time clube1 = new Time();
		clube1.setNome("Grêmio");
		clube1.setQtde_jogos(4);
		clube1.setQtde_vitorias(3);
		clube1.setQtde_empates(0);
		clube1.setQtde_derrotas(1);
		clube1.setGols_pro(5);
		clube1.setGols_contra(2);
		
		System.out.println("Clube: " + clube1.getNome() + "\nPontos: " + clube1.calcularPontos() + "\nJogos: " + clube1.getQtde_jogos() + "\nVitórias: " + clube1.getQtde_vitorias() + "\nEmpates: " + clube1.getQtde_empates() + "\nDerrotas: " + clube1.getQtde_derrotas() + "\nGols Pró: " + clube1.getGols_pro() + "\nGols Contra: " + clube1.getGols_contra() + "\nSaldo de gols: " + clube1.calcularSaldoGols() + "\nAproveitamento: " + clube1.calcularAproveitamento());
	}

}
