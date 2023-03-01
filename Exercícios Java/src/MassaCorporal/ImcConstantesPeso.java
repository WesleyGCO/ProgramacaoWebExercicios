package MassaCorporal;

public class ImcConstantesPeso {
	private char sexo;
	
	public ImcConstantesPeso(char sexo) {
		this.sexo = sexo;
	}
	
	public Double getAbaixoDoPeso() {
		return sexo=='F'?19.1:20.7;
	}
	
	public Double getPesoNormal() {
		return sexo=='F'?25.8:26.4;
	}
	
	public Double getMarginalmenteAcimaPeso() {
		return sexo=='F'?27.3:27.8;
	}
	
	public Double getAcimaDoPesoIdeal() {
		return sexo=='F'?32.3:31.1;
	}
	
	public Double getObeso() {
		return sexo=='F'?32.4:31.2;
	}
}
