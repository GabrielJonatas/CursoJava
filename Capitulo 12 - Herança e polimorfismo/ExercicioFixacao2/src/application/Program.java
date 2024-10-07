package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int numberTaxPayers = sc.nextInt();
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		for(int i = 0; i<numberTaxPayers; i++) {
			System.out.printf("Tax payer #%d data: ", i);
			System.out.print("Individual or company (i/c)? ");			
			char typeTaxPayer = sc.next().charAt(0);

			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
						
			if(typeTaxPayer == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				taxPayers.add(new Company(name, annualIncome, numberOfEmployees));
			} else if (typeTaxPayer == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();				
				
				taxPayers.add(new Individual(name, annualIncome, healthExpenditures));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		double totalTaxes = 0.0;
		
		for(TaxPayer t: taxPayers) {
			System.out.printf("%s: $ %.2f\n", t.getName(), t.taxToPay());
		
			totalTaxes += t.taxToPay();
		}
		
		System.out.printf("\nTOTAL TAXES: $ %.2f", totalTaxes);		
	}

}
