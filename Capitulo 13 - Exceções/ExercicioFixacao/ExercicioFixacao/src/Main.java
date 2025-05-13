import Entities.Account;
import Entities.exceptions.DomainExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account1 = new Account();

        System.out.println("Enter account Data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        account1.setNumber(number);

        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        account1.setHolder(holder);

        System.out.println("Initial balance: ");
        double initialBalance = sc.nextDouble();
        account1.setBalance(initialBalance);

        System.out.println("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        account1.setWithDrawLimit(withdrawLimit);


        System.out.println("\nEnter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            account1.withdraw(amount);
            System.out.printf("New balance: %.2f", account1.getBalance());
        } catch (DomainExceptions e) {
            System.out.println(e.getMessage());
        } catch(RuntimeException e) {
            System.out.println("Something went wrong");
        }
    }
}