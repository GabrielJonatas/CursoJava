package exercicios;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;  i<n; i++) {
			float x1 = sc.nextFloat();
			float x2 = sc.nextFloat();
			
			if (x2 == 0) {
				System.out.println("divisao impossível");
			} else {
				System.out.printf("%.1f\n", x1/x2);
			}
			
		}
		
		sc.close();

	}

}
