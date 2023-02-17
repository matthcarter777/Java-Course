package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Tax;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Tax> taxes = new ArrayList<Tax>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			System.out.println("Tax payer #" + i + " data: " );
			
			System.out.print("Individual or company (i/c)? ");
			String typeOfShape = sc.next();
		
			if (typeOfShape.equals("c")) {
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				
				Tax tax = new Company(name, anualIncome, employees);
				
				taxes.add(tax);
			} else if (typeOfShape.equals("i")) { 
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				
				System.out.print("Heath expenditures: ");
				double heathExpenditures = sc.nextDouble();
				
				Tax tax = new Individual(name, anualIncome, heathExpenditures);
				
				taxes.add(tax);
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double totalTaxes = 0;
		
		for (Tax t: taxes) {
			totalTaxes += t.paid();
			System.out.println(t.getName() + ": $ " + t.paid());
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + totalTaxes);
		
	}

}
