package app;

import java.util.Locale;
import java.util.Scanner;

import entitites.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double alturaMedia = 0;
		int menosDeDezesseis = 0;
		double porcentagemMenosDeDezesseis;
		Pessoa[] pessoas = new Pessoa[n];
		String[] nomesMenosDeDezesseis = new String[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: \n",i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			alturaMedia += altura;
			if(idade < 16) {
				nomesMenosDeDezesseis[menosDeDezesseis] = nome;
				menosDeDezesseis++;
			}
			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		
		porcentagemMenosDeDezesseis = 100*((double)menosDeDezesseis/n);
		
		System.out.printf("Altura média: %.2f\n", alturaMedia/n);
		System.out.printf("Pessoas com menos de 16 anos: %.1f", porcentagemMenosDeDezesseis);
		System.out.print("%\n");
		
		for(int j = 0 ; j<menosDeDezesseis; j++) {
			System.out.printf("%s\n", nomesMenosDeDezesseis[j]);
		}
		
		sc.close();
	}

}
