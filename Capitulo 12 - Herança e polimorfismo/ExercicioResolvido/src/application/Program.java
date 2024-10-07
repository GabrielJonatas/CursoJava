package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for(int i=1; i<=numberEmployees; i++) {
			System.out.printf("Employee #%d data:\n", i);

			System.out.printf("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.printf("Name: ");
			String name = sc.nextLine();
			
			System.out.printf("Hours: ");
			int hours = sc.nextInt();
			
			System.out.printf("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			Employee employee;
			
			if(outsourced == 'y') {
				System.out.printf("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("\nPAYMENTS:");
		for(Employee e: employees) {
			System.out.printf("%s - $ %.2f\n", e.getName(), e.payment());
		}

		sc.close();
	}

}
