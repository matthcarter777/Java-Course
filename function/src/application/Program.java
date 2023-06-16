package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;


public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		List<String> names =  list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
					
		names.forEach(System.out::println);
		
	}

}
