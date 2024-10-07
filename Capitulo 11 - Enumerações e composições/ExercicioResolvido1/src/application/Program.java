package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String department;
		String name;
		WorkerLevel level;
		Double baseSalary;
		Integer contracts;
		
		System.out.print("Enter department's name: ");
		department = sc.next();
		
		System.out.println("Enter worker data:");
		
		System.out.print("Name: ");
		name = sc.next();
		
		System.out.print("Level: ");
		level = WorkerLevel.valueOf(sc.next().toUpperCase());
		
		System.out.print("Base salary: ");
		baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, level, baseSalary, new Department(department));		
		
		System.out.print("How many contracts to this worker? ");
		contracts = sc.nextInt();
		
		for(int i=1; i<=contracts; i++) {
			System.out.printf("Enter contract #%d data:\n", i);
			String date;
			Double hourValue;
			Integer hours;
			
			System.out.print("Date (DD/MM/YYYY): ");
			date = sc.next();
			
			System.out.print("Value per hour: ");
			hourValue = sc.nextDouble();

			System.out.print("Duration (hours): ");
			hours = sc.nextInt();
			
			HourContract hourContract = new HourContract(format.parse(date), hourValue, hours);
			worker.addContract(hourContract);
		}
		
		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		String date = sc.next();
		
		sc.close();
		
		int month = Integer.parseInt(date.substring(0, 2));
		int year = Integer.parseInt(date.substring(3));
		
		System.out.printf("Name: %s\n", worker.getName());
		
		System.out.printf("Department: %s\n", department);
		
		Double income = worker.income(year, month);
		
		System.out.printf("Income for %s: %.2f", date, income);
	}

}
