package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Recebe os dados e instancia o primeiro jogador
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome:");
		String nome1 = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		int vida1 = sc.nextInt();
		
		System.out.print("Ataque: ");
		int ataque1 = sc.nextInt();
		
		System.out.print("Armadura: ");
		int armadura1 = sc.nextInt();
		
		// Consuma a nova linha deixada no buffer
		sc.nextLine();
		
		
		Champion player1 = new Champion(nome1, vida1, ataque1, armadura1);
		
		System.out.println("");
		
		// Recebe os dados e instancia o segundo jogador
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome:");
		String nome2 = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		int vida2 = sc.nextInt();
		
		System.out.print("Ataque: ");
		int ataque2 = sc.nextInt();
		
		System.out.print("Armadura: ");
		int armadura2 = sc.nextInt();
			
		Champion player2 = new Champion(nome2, vida2, ataque2, armadura2);

		// Define a quantidade de rodadas
		System.out.println("");
		System.out.print("Quantos turnos você deseja executar? "); int qtdTurnos =
		sc.nextInt();
		
		//Mostra os resultados
		for (int i = 1; i <= qtdTurnos; i++) {
			
			player2.takeDamage(player1);
			player1.takeDamage(player2);
			
			System.out.println("");
			System.out.println("Resultado do turno "+i+":");

			System.out.println(player1.status());
			System.out.println(player2.status());
			
			if (player1.getLife() <= 0 || player2.getLife() <= 0) {
				i = qtdTurnos;
			}
		}
		 
		System.out.println("");
		System.out.println("FIM DE COMBATE");
		
		sc.close();

	}

}
