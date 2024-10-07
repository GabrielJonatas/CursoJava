package program;

import java.util.Locale;
import java.util.Scanner;

import exercicio02.Employee;
import exercicioFixacao.CurrencyConverter;
import exercise01.Rectangle;
import exercise03.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);

		// Exercicio 01
		/*Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		System.out.printf("AREA = %.2f\n", rectangle.Area());
		System.out.printf("PERIMETER = %.2f\n", rectangle.Perimeter());
		System.out.printf("DIAGONAL = %.2f", rectangle.Diagonal());*/
		
		// Exercicio 02
		/*Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("\nEmployee: %s, $ %.2f\n", employee.name, employee.NetSalary());
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		System.out.printf("\nUpdated data: %s, $ %.2f", employee.name, employee.NetSalary());*/
		
		// Exercicio 03
		/*Student student = new Student();
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f\n", student.FinalGrade());
		student.PassOrFailed();*/
		
		// Exercicio de fixação
		
		// double realToDolar = CurrencyConverter.dolarConverter(3.10, 200.00);
		// System.out.printf("Amount to be paid in reais = %.2f", realToDolar);
	}
}
