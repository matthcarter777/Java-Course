package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		
		Consumer<Product> cons = (c) -> c.setPrice(c.getPrice() * 1.10);
		
		
		//InLine
		list.forEach((c) -> c.setPrice(c.getPrice() * 1.10));
		
		
		for (Product p: list) {
			System.out.println(p);
		}
		
	}

}
