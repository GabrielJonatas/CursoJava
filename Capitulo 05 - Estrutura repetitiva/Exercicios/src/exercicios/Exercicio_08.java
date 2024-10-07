package exercicios;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = fibonacci(n);
		
		System.out.printf("%d\n", result);
		
		sc.close();

	}
	
	private static int fibonacci(int n) {
		if (n <= 1 ) {
			return n;
		} else {
			return n*fibonacci(n-1);
		}
	}

}
