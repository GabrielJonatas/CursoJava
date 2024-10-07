package exercicios;

import java.util.Scanner;

import java.lang.Math;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double area, pi = 3.14159;
		
		double raio = scanner.nextDouble();
		
		//double raio = 5.64;
		
		scanner.close();
		
		area = pi*Math.pow(raio, 2.0);
		
		System.out.printf("A=%.4f", area);
	}

}
