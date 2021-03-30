public class JogoDaVelha {
	private  String[][] tabuleiro;

	public String[][] getTabuleiro() {
		return tabuleiro;
	}


	public JogoDaVelha(int dimensao) {
		tabuleiro = new String[dimensao][dimensao];
	}


	public boolean realizaJogada(int i, int j, String jogada) {
		if(tabuleiro[i][j] == null) {
			tabuleiro[i][j] = jogada;
			System.out.println("Jogada inserida com sucesso!");
			System.out.println();
			return true;
		}else
			System.out.println("Posição já utilizada");
		System.out.println();
		return false;
	}


	public boolean tabuleiroPreenchido() {
		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro.length; j++) {
				if(tabuleiro[i][j] == null)
					return true;
			}
		}
		return false;
	}


	public boolean verificaGanhadorLinhaX() {
		int qtdJogadas = 0;
		String primeiraJogada = "X";

		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro[i].length; j++) {

				if(tabuleiro[i][j].equals(primeiraJogada)) {
					qtdJogadas++;

				}else {
					break;
				}
			}
		}
		if(qtdJogadas == tabuleiro.length)
			return true;

		return false;
	}

	public boolean verificaGanhadorColunaX() {
		int qtdJogadas = 0;
		String primeiraJogada = "X";

		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro[i].length; j++) {

				if(tabuleiro[j][i].equals(primeiraJogada)) {
					qtdJogadas++;

				}else {
					break;
				}
			}
		}
		if(qtdJogadas == tabuleiro.length)
			return true;

		return false;
	}

	public boolean verificaGanhadorDiagonalPrimX() {
		int qtdJogadas = 0;
		String primeiraJogada = "X";

		for(int i = 0; i < tabuleiro.length; i++) {
			if(tabuleiro[i][i].equals(primeiraJogada)) {
				qtdJogadas++;

			}else {
				break;
			}

		}
		if(qtdJogadas == tabuleiro.length)
			return true;

		return false;
	}

	public boolean verificaGanhadorDiagonalSecX() {
		int qtdJogadas = 0;
		String primeiraJogada = "X";

		for(int i = 0; i < tabuleiro.length; i++) {
			if(tabuleiro[i][tabuleiro.length -1 -i].equals(primeiraJogada)) {
				qtdJogadas++;

			}else {
				break;
			}

		}
		if(qtdJogadas == tabuleiro.length)
			return true;

		return false;
	}

	public boolean verificaGanhadorLinhaO() {
		int qtdJogadas = 0;
		String primeiraJogada = "O";

		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro[i].length; j++) {

				if(tabuleiro[i][j].equals(primeiraJogada)) {
					qtdJogadas++;

				}else {
					break;
				}
			}
		}
		if(qtdJogadas == tabuleiro.length)
			return true;

		return false;
	}

	public boolean verificaGanhadorColunaO() {
		int qtdJogadas = 0;
		String primeiraJogada = "O";

		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro[i].length; j++) {

				if(tabuleiro[j][i].equals(primeiraJogada)) {
					qtdJogadas++;

				}else {
					break;
				}
			}
		}
		if(qtdJogadas == tabuleiro.length)
			return true;

		return false;
	}

	public boolean verificaGanhadorDiagonalPrimO() {
		int qtdJogadas = 0;
		String primeiraJogada = "O";

		for(int i = 0; i < tabuleiro.length; i++) {
			if(tabuleiro[i][i].equals(primeiraJogada)) {
				qtdJogadas++;

			}else {
				break;
			}

		}
		if(qtdJogadas == tabuleiro.length)
			return true;

		return false;
	}

	public boolean verificaGanhadorDiagonalSecO() {
		int qtdJogadas = 0;
		String primeiraJogada = "O";

		for(int i = 0; i < tabuleiro.length; i++) {
			if(tabuleiro[i][tabuleiro.length -1 -i].equals(primeiraJogada)) {
				qtdJogadas++;

			}else {
				break;
			}

		}
		if(qtdJogadas == tabuleiro.length)
			return true;

		return false;
	}

	public  void limpaTabuleiro() {
		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = null;
			}
		}
	}
	
	public  void imprimeTabuleiro() {
		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro.length; j++) {
					System.out.print(" - " + tabuleiro[i][j] + " - ");
			}
		}
	}
}
