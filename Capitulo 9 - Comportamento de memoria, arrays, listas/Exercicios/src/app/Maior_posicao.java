package app;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double maior = 0;
		int maiorIndice = 0;
		double[] numeros = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			if(i == 0) {
				maior = numeros[i];
				maiorIndice = i;
			} else {
				if(maior < numeros[i]) {
					maior = numeros[i];
					maiorIndice = i;
				}
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", maiorIndice);		
		
		sc.close();
	}

}
