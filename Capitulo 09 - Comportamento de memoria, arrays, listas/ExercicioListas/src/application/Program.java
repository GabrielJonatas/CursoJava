package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Employee> employees = new ArrayList<>();
				
		System.out.println("");
		
		for(int i=0; i<n; i++) {
			
			System.out.printf("Employee #%d:\n",i+1);
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			System.out.println("");
			
			employees.add(new Employee(id,name,salary));
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		Integer id = sc.nextInt();
		
		Employee employee = employees.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
		
		if(employee == null) {
			System.out.println("This id doesn't exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		}
		
		System.out.println("\nList of employees:");
		
		for(Employee element: employees) {
			System.out.println(element.toString());
		}
		
		sc.close();
	}
}
