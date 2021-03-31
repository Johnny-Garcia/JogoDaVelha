import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {

		String nome = null;
		int pontuacao = 0;
		int dimensao = 0;
		Scanner sc = new Scanner(System.in);
		int continuarJogando = 0;

		System.out.println("Digite o nome do primeiro jogador e sua pontua��o inicial");
		nome = sc.nextLine();
		pontuacao = sc.nextInt();
		Jogador O = new Jogador(nome, pontuacao);
		sc.nextLine();
		System.out.println("Digite o nome do segundo jogador e sua pontua��o inicial");
		nome = sc.nextLine();
		pontuacao = sc.nextInt();
		Jogador X = new Jogador(nome, pontuacao);

		System.out.println("Digite o tamanho do tabuleiro");
		dimensao = sc.nextInt();
		JogoDaVelha tab = new JogoDaVelha(dimensao);

		int i = 0;
		int j = 0;
		String jogada = null;
			
		do {
		
			do {
				do {
					System.out.printf("Pr�ximo jogador � a sua vez%n");
					System.out.println();
					System.out.printf("Digite a posi��o da linha%n");
					i = sc.nextInt();
					System.out.printf("Digite a posi��o da coluna%n");
					j = sc.nextInt();
					System.out.printf("Digite a jogada%n");
					sc.nextLine();
					jogada = sc.nextLine();
			
				}while (tab.realizaJogada(i, j, jogada) == false);
				
			}while(tab.tabuleiroPreenchido() == true);
			
	
			if(tab.verificaGanhadorColunaX() == true) {
				System.out.println("Temos o vencedor X na Coluna");
				X.aumentaPonto();
			}else if(tab.verificaGanhadorLinhaX() == true) {
				System.out.println("Temos o vencedor X  na Linha");
				X.aumentaPonto();
			}else if(tab.verificaGanhadorDiagonalPrimX() == true) {
				System.out.println("Temos o vencedor X  na Diagonal Prim�ria");
				X.aumentaPonto();
			}else if(tab.verificaGanhadorDiagonalSecX() == true) {
				System.out.println("Temos o vencedor X  na Diagonal Secund�ria");
				X.aumentaPonto();
			}else if(tab.verificaGanhadorColunaO() == true) {
				System.out.println("Temos o vencedor O na Coluna");
				O.aumentaPonto();
			}else if(tab.verificaGanhadorLinhaO() == true) {
				System.out.println("Temos o vencedor O na Linha");
				O.aumentaPonto();
			}else if(tab.verificaGanhadorDiagonalPrimO() == true) {
				System.out.println("Temos o vencedor O na Diagonal Prim�ria");
				O.aumentaPonto();
			}else if(tab.verificaGanhadorDiagonalSecO() == true) {
				System.out.println("Temos o vencedor O na Diagonal Secund�ria");
				O.aumentaPonto();
			}else
				System.out.println("N�o temos um vencedor");
			
			tab.imprimeTabuleiro();
			System.out.println();
			
			X.imprimeDados();
			O.imprimeDados();
			
			System.out.println();
			System.out.println("Gostaria de Jogar novamente? Digite 1 - SIM ou 2 - N�O:");
			System.out.println();
			
			continuarJogando = sc.nextInt();
			
			tab.limpaTabuleiro();
			
		}while(continuarJogando == 1);
		
		//comentario teste
		sc.close();
	}

}
