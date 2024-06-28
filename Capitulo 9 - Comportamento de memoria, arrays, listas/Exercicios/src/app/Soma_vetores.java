package app;

import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i=0; i<n; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int j=0; j<n; j++) {
			vetorB[j] = sc.nextInt();
			vetorC[j] = vetorA[j] + vetorB[j];
		}
		
		System.out.println("VETOR RESULTANTE:");		
		for(int k=0; k<n; k++) {
			System.out.printf("%d\n",vetorC[k]);			
		}
		
		sc.close();
	}

}
