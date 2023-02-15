package TabelaBrasileirao;

public class Time {
	private String nome;
	private int pontos;
	private int qtde_jogos;
	private int qtde_vitorias;
	private int qtde_empates;
	private int qtde_derrotas;
	private int gols_pro;
	private int gols_contra;
	private int saldo_gols;
	//private float aproveitamento;
	
	public Time() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtde_jogos() {
		return qtde_jogos;
	}

	public void setQtde_jogos(int qtde_jogos) {
		this.qtde_jogos = qtde_jogos;
	}

	public int getQtde_vitorias() {
		return qtde_vitorias;
	}

	public void setQtde_vitorias(int qtde_vitorias) {
		this.qtde_vitorias = qtde_vitorias;
	}

	public int getQtde_empates() {
		return qtde_empates;
	}

	public void setQtde_empates(int qtde_empates) {
		this.qtde_empates = qtde_empates;
	}

	public int getQtde_derrotas() {
		return qtde_derrotas;
	}

	public void setQtde_derrotas(int qtde_derrotas) {
		this.qtde_derrotas = qtde_derrotas;
	}

	public int getGols_pro() {
		return gols_pro;
	}

	public void setGols_pro(int gols_pro) {
		this.gols_pro = gols_pro;
	}

	public int getGols_contra() {
		return gols_contra;
	}

	public void setGols_contra(int gols_contra) {
		this.gols_contra = gols_contra;
	}
	
	public int calcularSaldoGols() {
		return this.saldo_gols = this.gols_pro - this.gols_contra;
	}
	
	public int calcularPontos() {
		this.pontos = (this.qtde_vitorias * 3) + this.qtde_empates;
		
		return this.pontos;
	}
	
	public double calcularAproveitamento() {
		
		double aproveitamento = (this.pontos / (this.qtde_jogos * 3));
		
		return aproveitamento;
	}
	
}
