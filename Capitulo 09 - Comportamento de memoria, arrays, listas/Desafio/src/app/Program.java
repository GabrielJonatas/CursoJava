package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Student[] rooms = new Student[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		System.out.println("");
		
		for(int i=0; i<n; i++) {
			System.out.printf("Rent #%d:\n",i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			System.out.println("");
			rooms[room-1] = new Student(name, email);
		}

		System.out.println("Busy rooms:");
		for(int j=0; j<10;j++) {
			if(rooms[j] != null) {
				System.out.printf("%d: %s\n", j+1, rooms[j].toString());
			}
		}
		
		sc.close();
	}

}
