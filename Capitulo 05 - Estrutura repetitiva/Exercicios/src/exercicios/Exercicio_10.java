package exercicios;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int twoPower = i*i;
			int threePower = i*i*i;
			System.out.printf("%d %d %d\n",i,twoPower,threePower);
		}
		
		sc.close();
	}

}
