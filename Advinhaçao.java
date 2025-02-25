package projeto01;

import java.util.Scanner;
import java.util.Random;

public class Advinhaçao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int numeroComputador = random.nextInt(100) + 1;

		// Scanner para ler a entrada do usuário
		Scanner sc = new Scanner(System.in);

		int numeroUsuario = 0;
		int tentativas = 0;

		System.out.println("Bem-vindo ao jogo de adivinhação!");
		System.out.println("Tente adivinhar o número, o número está entre 1 e 100.");

		// Laço de repetição enquanto o usuário não acertar
		while (numeroUsuario != numeroComputador) {
			// Pede para o usuário digitar um número
			System.out.print("Digite seu palpite: ");
			numeroUsuario = sc.nextInt();
			tentativas++; // Conta a tentativa

			// Verifica se o número do usuário é maior ou menor que o número sorteado
			if (numeroUsuario < numeroComputador) {
				System.out.println("O número é maior. Tente novamente.");
			} else if (numeroUsuario > numeroComputador) {
				System.out.println("O número é menor. Tente novamente.");

				System.out.println(
						"Parabéns! Você acertou o número " + numeroComputador + " em " + tentativas + " tentativas.");

				sc.close(); 
			}
		}

	}

}
