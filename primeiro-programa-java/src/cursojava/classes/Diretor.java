package cursojava.classes;

public class Diretor extends Pessoa {
	
	private String registroEducac�o;
	private int tempoDirecao;
	private String titulacao;
	
	public String getRegistroEducac�o() {
		return registroEducac�o;
	}
	public void setRegistroEducac�o(String registroEducac�o) {
		this.registroEducac�o = registroEducac�o;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducac�o=" + registroEducac�o + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 7900.94;
	}
	
	

}
