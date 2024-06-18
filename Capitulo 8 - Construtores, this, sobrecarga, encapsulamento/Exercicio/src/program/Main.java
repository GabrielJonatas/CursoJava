package program;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ContaBancaria conta;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char yesNo = sc.next().charAt(0);
		
		if(yesNo == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			conta = new ContaBancaria(accountHolder, accountNumber, deposit);
		} else {
			conta = new ContaBancaria(accountHolder, accountNumber);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		conta.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		conta.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();
	}
}
