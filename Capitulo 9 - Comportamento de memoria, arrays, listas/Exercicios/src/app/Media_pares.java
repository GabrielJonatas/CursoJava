package app;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double media = 0;
		int numeroDePares = 0;;
		int[] vetor = new int[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			if(vetor[i]%2 == 0) { 
				media += vetor[i];
				numeroDePares++;
			}
		}
		
		if(media == 0) {
			System.out.print("NENHUM NUMERO PAR");
		} else {
			System.out.printf("MEDIA DOS PARES = %.1f", (double)media/numeroDePares);
		}
		
		sc.close();
	}

}
