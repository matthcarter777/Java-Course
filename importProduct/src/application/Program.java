package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;


public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<Product>();
		
		System.out.print("Enter the number of producst: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			System.out.println("Product #" + i + " data: " );
			
			System.out.print("Common, used or imported (c/u/i)? ");
			String option = sc.next();
			
			if (option.equals("c")) {
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				Product product = new Product(name, price);
				
				products.add(product);
			} else if (option.equals("u")) {
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				
				UsedProduct product = new UsedProduct(name, price, date);
				products.add(product);
			} else if (option.equals("i")) {
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				
				ImportedProduct product = new ImportedProduct(name, price, fee);
				products.add(product);
			}
		}
		
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p: products) {
			System.out.println(p.priceTag());

		}

	}

}
