package exercicios;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		sc.close();
		
		if(numero >= 0 && numero <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (numero > 25 && numero <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (numero > 50 && numero <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (numero > 75 && numero <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
	}
}
