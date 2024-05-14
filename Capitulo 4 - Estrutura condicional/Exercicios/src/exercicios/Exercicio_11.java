package exercicios;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		sc.close();
		
		switch (codigo) {
		case 1:
			System.out.printf("Total: R$ %.2f\n", 4.00*quantidade);
			break;
		case 2:
			System.out.printf("Total: R$ %.2f\n", 4.50*quantidade);
			break;
		case 3:
			System.out.printf("Total: R$ %.2f\n", 5.00*quantidade);
			break;
		case 4:
			System.out.printf("Total: R$ %.2f\n", 2.00*quantidade);
			break;
		case 5:
			System.out.printf("Total: R$ %.2f\n", 1.50*quantidade);
			break;
		default:
			System.out.println("Item não existente");
			break;
		}

	}

}
