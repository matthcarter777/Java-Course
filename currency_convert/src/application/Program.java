package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Currency;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double basConvert = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double basAmount = sc.nextDouble();
		
		Currency.value = basAmount;
		Currency.bas = basConvert;
		
		System.out.println("Amount to be paid in reais = " + Currency.currencyConverter());
		
		sc.close();
	}

}
