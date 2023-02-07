package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitites.Client;
import entitites.Order;
import entitites.OrderItem;
import entitites.Product;
import entitites.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date moment = sdf.parse(sc.nextLine());
		
		Client client = new Client(name, email, moment);
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		System.out.print("How many items to this order: ");
		int number = sc.nextInt();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
			
		for (int i = 1; i <= number; i++) {
			System.out.println("Enter #" + i + " item data:");
			
			System.out.print("Product name: ");
			String nameItem = sc.next();
			
			System.out.print("Product price: ");
			double priceItem = sc.nextDouble();
			
			Product product = new Product(name, priceItem);
			
			System.out.print("Quantity: ");
			int quantityItem = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantityItem, priceItem, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println("");
		System.out.println(order.toString());
		
		sc.close();
	}

}
