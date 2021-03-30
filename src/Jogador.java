public class Jogador {
	
	private String nome;
	private int pontos;
	
	public Jogador(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public void aumentaPonto() {
		pontos++;
	}

	public String toString() {
		return "Jogador: nome=" + nome + ", pontos=" + pontos ;
	}
	
	public void imprimeDados() {
		System.out.printf("O jogador %s tem %d pontos%n", nome, pontos );
	}
	
	
}
