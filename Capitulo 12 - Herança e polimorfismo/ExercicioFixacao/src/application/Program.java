package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		
		List<Product> products = new ArrayList<>();
		
		for(int i=1; i<=numberProducts; i++) {
			System.out.printf("Product #%d data:\n", i);

			System.out.printf("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.printf("Name: ");
			String name = sc.nextLine();
			
			System.out.printf("Price: ");
			Double price = sc.nextDouble();
			
			if(type == 'c') {
				products.add(new Product(name, price));
			} else if(type == 'u') {
				System.out.printf("(DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				
				products.add(new UsedProduct(name, price, manufactureDate));
			} else if(type == 'i') {
				System.out.printf("Custom fee: ");
				Double customFee = sc.nextDouble();
				
				products.add(new ImportedProduct(name, price, customFee));
			}
		}	
		
		System.out.println("\nPRICE TAGS: ");
		for(Product p: products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}
}
