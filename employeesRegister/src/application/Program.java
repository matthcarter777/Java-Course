package application;

import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numberEmployeers = 0;
		
		List<Employer> employers = new ArrayList<Employer>();
		
		System.out.println("How many employees will be registered? ");
		numberEmployeers = sc.nextInt();

		
		for (int i = 0; i < numberEmployeers; i++ ) {
			System.out.println();
			
			System.out.println("Employee # " + i + 1);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Object obj = employers.stream().filter(e -> e.getId() == id ).findFirst().orElse(null);
			
			if (obj == null) {
				Employer employer = new Employer(id, name, salary);
				
				employers.add(employer);
			} else {
				System.out.println("User already exists");
			}

		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have increase: ");
		int idUser = sc.nextInt();
		System.out.println("Enter the percentage: ");
		double increment = sc.nextDouble();
		
		Employer obj = employers.stream().filter(e -> e.getId() == idUser ).findFirst().orElse(null);
		
		if (obj != null) {
			obj.alterSalary(increment);
		} else {
			System.out.println("This id does not exist!");
		}
		
		
		System.out.println();
		System.out.println("List of employees: ");

		for (Employer e: employers) {
			System.out.println(e.getInformations());
		}
		

	}

}
