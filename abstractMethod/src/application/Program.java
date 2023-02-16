package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<Shape>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			System.out.println("Shape #" + i + " data: " );
			
			System.out.print("Rectangle or Circle (r/c)? ");
			String typeOfShape = sc.next();
			
			if (typeOfShape.equals("r")) {
				System.out.print("Color: ");
				String color = sc.next();
				
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Heigth: ");
				double height = sc.nextDouble();
			
				Rectangle rectangle = new Rectangle(Color.valueOf(color), height, width);
				
				shapes.add(rectangle);
			} else if (typeOfShape.equals("c")) {
				System.out.print("Color: ");
				String color = sc.next();
				
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				Circle circle = new Circle(Color.valueOf(color), radius);
				
				shapes.add(circle);
			}
			

		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for (Shape s: shapes) {
			System.out.println(s.area());
		}

	}

}
