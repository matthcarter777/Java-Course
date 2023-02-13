package application;

import entitites.Account;
import entitites.BussinesAccount;
import entitites.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BussinesAccount bacc = new BussinesAccount(); 
		
		// UPCASTING 
		
		Account acc1 = bacc;
		Account acc2 = new BussinesAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Fred", 0.0, 0.5);
		
		// DOWNCASTING
		
		BussinesAccount acc4 = (BussinesAccount)acc2;
		
		// Sobreposicao
		
		Account acc5 = new Account(1005, "Relampago marquinho", 1000.0);
		acc5.withdraw(200.00);
		System.out.println(acc5.getBalance());
		
		Account acc6 = new SavingAccount(1006, "Xola", 1000.0, 100.00);
		acc6.withdraw(200.00);
		System.out.println(acc6.getBalance());
		
		// Utilizando palavra super() para reutilizar função
		
		Account acc7 = new BussinesAccount(1007, "Cratos", 1000.0, 100.00);
		acc7.withdraw(200.00);
		System.out.println(acc7.getBalance());
		
		//Polimorfismo 
		
		Account acc8 = new Account(1010, "Lucio", 1000.0);
		Account acc9 = new SavingAccount(1011, "Xandão", 1000.0, 100.00);
		
		System.out.println("Polimorfismo");
		
		acc8.withdraw(50.00);
		System.out.println(acc8.getBalance());
		
		acc9.withdraw(50.00);
		System.out.println(acc9.getBalance());
	}

}
