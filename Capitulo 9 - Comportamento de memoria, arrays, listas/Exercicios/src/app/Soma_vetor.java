package app;

import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int i;
		double[] vetor = new double[n];
		double soma = 0;
		
		for(i = 0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}

		System.out.print("VALORES = ");
		for(i = 0; i<vetor.length; i++) {
			System.out.printf("%.1f ",vetor[i]);
		}
		System.out.println();
		System.out.printf("SOMA = %.2f\n",soma);
		System.out.printf("MEDIA = %.2f", soma/vetor.length);
		
		sc.close();

	}

}
