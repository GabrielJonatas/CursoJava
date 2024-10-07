package exercicios;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			float v1 = sc.nextFloat();
			float v2 = sc.nextFloat();
			float v3 = sc.nextFloat();
			float media = ((v1*2) + (v2*3) + (v3*5))/10;
			
			System.out.printf("%.1f\n", media);
		}
		
		sc.close();
	}

}
