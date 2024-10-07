package app;

import java.util.Locale;
import java.util.Scanner;

public class Numero_pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		int count = 0;
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
	
		System.out.println("\nNUMEROS PARES:");
		
		for(int i=0;i<n;i++) {
			if(numeros[i]%2 == 0) {
				System.out.printf("%d ",numeros[i]);
				count++;
			}
		}

		System.out.printf("\n\nQUANTIDADE DE PARES = %d", count);
		
		sc.close();
	}

}
