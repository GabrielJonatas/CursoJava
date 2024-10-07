package exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		int a,b,c,d;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();

		scanner.close();
		
		int diferenca = (a*b) - (c*d);
		
		System.out.printf("DIFERENCA = %d", diferenca);
	}

}
