package exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senhaDigitada = sc.nextInt();
		
		while(senhaDigitada != 2002) {
			System.out.println("Senha Invalida");
			senhaDigitada = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
