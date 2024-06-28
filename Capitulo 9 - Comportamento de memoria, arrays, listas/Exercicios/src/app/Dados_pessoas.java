package app;

import java.util.Locale;
import java.util.Scanner;

import entitites.Pessoa;

public class Dados_pessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double mediaAlturaMulheres = 0;
		double numeroMulheres = 0;
		Pessoa[] pessoas = new Pessoa[n];
		Pessoa[] menorMaiorAltura = new Pessoa[n];
		menorMaiorAltura[0] = new Pessoa('M', 3.0);
		menorMaiorAltura[1] = new Pessoa('M', 0.0);
		
		for(int i=0; i<pessoas.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			sc.nextLine();
			char genero = sc.next().charAt(0);
			if( genero == 'F') {
				numeroMulheres += 1.0;
				mediaAlturaMulheres += altura;
			}
			pessoas[i] = new Pessoa(genero, altura);
			if(altura < menorMaiorAltura[0].getAltura()) {
				menorMaiorAltura[0] = pessoas[i];
			} else if (altura > menorMaiorAltura[1].getAltura()) {
				menorMaiorAltura[1] = pessoas[i];				
			}
		}
		
		mediaAlturaMulheres /= numeroMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorMaiorAltura[0].getAltura());
		System.out.printf("Maior altura = %.2f\n", menorMaiorAltura[1].getAltura());
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
		System.out.printf("Numero de homens = %d", n - (int) numeroMulheres);
		
		sc.close();
	}

}
