package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String name = sc.next();
		
		System.out.print("Is there na initial deposit (y/n): ");
		String confirmation = sc.next();
		
		String bas = "y";
		double balance = 0;
		
		if (confirmation.equals(bas)) {
			System.out.print("Enter initial value deposit value: ");
			balance = sc.nextDouble();
		} else if (confirmation == "n") {
			balance = 0;
		}
		
		
		Account account = new Account(numberAccount, name, balance);
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		double amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		sc.close();

	}

}
