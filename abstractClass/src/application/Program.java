package application;

import entitites.Account;
import entitites.BussinesAccount;
import entitites.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
		Account acc3 = new BussinesAccount(1003, "Bob", 1000.0, 500.0);
	}

}
