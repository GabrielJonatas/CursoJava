package exercicios;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inteiro;
		
		inteiro = sc.nextInt();
		
		sc.close();

		if (inteiro%2 == 0) {
			System.out.println("PAR\n");
		} else {
			System.out.println("IMPAR\n");			
		}
	}

}
