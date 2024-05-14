package exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0;
		
		int itemEscolhido = sc.nextInt();
		
		while (itemEscolhido != 4) {
			if(itemEscolhido == 1) {
				alcool += 1;
			} else if (itemEscolhido == 2) {
				gasolina += 1;
			} else if (itemEscolhido == 3) {
				diesel += 1;
			}
			itemEscolhido = sc.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n",alcool,gasolina,diesel);
	}

}
