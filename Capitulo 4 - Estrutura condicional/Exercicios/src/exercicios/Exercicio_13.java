package exercicios;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float x,y;
		
		x = sc.nextFloat();
		y = sc.nextFloat();

		sc.close();
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
			return;
		}
		if(x == 0) {
			System.out.println("Eixo X");
			return;
		}
		if(y == 0) {
			System.out.println("Eixo Y");
			return;
		}
		
		if(x>0 && y>0) {
			System.out.println("Q1");
		} else if (x<0 && y>0) {
			System.out.println("Q2");
		} else if (x<0 && y<0) {
			System.out.println("Q3");
		} else if (x>0 && y<0) {
			System.out.println("Q4");
		}
	}

}
