package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		
		String name = sc.next();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		
		Product prod = new Product(name, price, quantity);
		
		System.out.println("Product " + prod);
		
		
		System.out.printf("Enter the number of products to be added in stock: ");
		
		int newQuantity = sc.nextInt();
		
		prod.addProducts(newQuantity);
		
		System.out.println("Uppdated " + prod);
		
		
		System.out.printf("Enter the number of products to be removed from stock: ");
		
		newQuantity = sc.nextInt();
		
		prod.removeProducts(newQuantity);
		
		System.out.println("Uppdated " + prod);
		
		sc.close();
	}

}
