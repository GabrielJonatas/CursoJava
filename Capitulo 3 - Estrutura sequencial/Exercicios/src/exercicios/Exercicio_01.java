package exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		scanner.close();
		
		System.out.printf("SOMA = %d",a+b);
	}

}
