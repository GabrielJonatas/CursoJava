package exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i += 2) {
			System.out.printf("%d\n", i);
		}
		
		sc.close();

	}

}
