package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Enter client data:\n");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdf.parse(sc.next());
		Client client = new Client(name, email, birth);
		System.out.print("Enter order data:\n");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());
		Order order = new Order(client, status);
		System.out.print("How many items to this order? ");
		int numberOfOrders = sc.nextInt();
		for(int i=1; i<=numberOfOrders; i++) {
			System.out.printf("Enter #%d item data:\n", i);
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			Product product = new Product(productName, productPrice);
			OrderItem item = new OrderItem(product, productQuantity);
			order.addItem(item);
		}
		System.out.print(order);
	}
}
