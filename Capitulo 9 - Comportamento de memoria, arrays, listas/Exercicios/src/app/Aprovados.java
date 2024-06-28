package app;

import java.util.Locale;
import java.util.Scanner;

import entitites.Aluno;

public class Aprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		Aluno[] alunos = new Aluno[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno\n", i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			alunos[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados:");		
		
		for(int j=0; j<n; j++) {
			if(((alunos[j].getNotaSemestre1() + alunos[j].getNotaSemestre2())/2.0)>= 6.0) {		
				System.out.printf("%s\n",alunos[j].getNome());		
			}
		}
		
		sc.close();
	}

}
