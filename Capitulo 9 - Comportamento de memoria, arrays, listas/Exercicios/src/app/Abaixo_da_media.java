package app;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double media = 0;
		double[] vetores = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetores[i] = sc.nextDouble();
			media += vetores[i]/n;
		}
		
		System.out.println("");
				
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int l=0; l<n; l++) {	
			if(vetores[l] < media) System.out.printf("%.1f\n", vetores[l]);
		}		
		
		sc.close();
	}

}
