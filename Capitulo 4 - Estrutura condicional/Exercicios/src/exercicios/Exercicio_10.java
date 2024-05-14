package exercicios;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal, duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		sc.close();
		
		duracao = horaFinal - horaInicial;
		
		if (duracao > 0) {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 + duracao);
		}
	}

}
