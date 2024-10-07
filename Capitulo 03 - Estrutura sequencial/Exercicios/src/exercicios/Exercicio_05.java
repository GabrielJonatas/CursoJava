package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		int codigo1, codigo2, quantidadePecas1, quantidadePecas2;
		double valorUnitario1, valorUnitario2;
		
		codigo1 = sc.nextInt();
		quantidadePecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		codigo2 = sc.nextInt();
		quantidadePecas2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		sc.close();

		double valorPago = (quantidadePecas1 * valorUnitario1) + (quantidadePecas2 * valorUnitario2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPago);
	}

}
