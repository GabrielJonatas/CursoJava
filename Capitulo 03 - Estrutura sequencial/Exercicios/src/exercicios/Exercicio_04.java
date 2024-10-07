package exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, horasTrabalhadas;
		double valorHora;
		
		numero = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		sc.close();

		double salario = horasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER: %d\nSALARY = U$ %.2f", numero, salario);
		
	}

}
