package app;

import java.util.Scanner;

import entitites.Pessoa;

public class Mais_velho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[n];
		int maiorIdade = 0;
		String maisVelho = "";
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: \n",i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			pessoas[i] = new Pessoa(nome, idade);
			if(i == 0) {
				maiorIdade = idade;
				maisVelho = nome;
				
			} else {
				if(maiorIdade < idade) {
					maiorIdade = idade;
					maisVelho = nome;
				}
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", maisVelho);
		
		sc.close();

	}

}
