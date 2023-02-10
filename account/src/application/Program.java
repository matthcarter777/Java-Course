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
	}

}
