package app;

import java.util.Scanner;

public class Negatives {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int i,j;
		int[] vetor = new int[n];
		
		for(i = 0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for(j = 0; j<vetor.length; j++) {
			if(vetor[j] < 0) {
				System.out.println(vetor[j]);				
			}
		}
		sc.close();

	}

}
