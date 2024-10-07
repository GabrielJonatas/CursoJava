package exercicios;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salario = sc.nextFloat();
		
		sc.close();
		
		float imposto = 0;
		
		// faixa de 0 a 2000
		if(salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento");
			return;
		} else {
			salario -= 2000.00;
		}
		
		// faixa de 2000,01 ate 3000,00
		if (salario < 1000) {
			imposto += salario*0.08;
			System.out.printf("R$ %.2f",imposto);
			return;
		} else {
			imposto += 1000.00*0.08;
			salario -= 1000.00;
		}
		
		// faixa de 3000,01 ate 4500,00 e acima de 4500.00
		if (salario < 1500.00) {
			imposto += salario*0.18;
			System.out.printf("R$ %.2f",imposto);
			return;
		} else {
			imposto += 1500.00*0.18 + ((salario-1500.00)*0.28);
			System.out.printf("R$ %.2f",imposto);
		}

	}

}
