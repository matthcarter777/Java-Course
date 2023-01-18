package entities;

public class Account {
	private int numberAccount;
	private String name;
	private double balance;
	
	private static int tax = 5;
	
	public Account(int numberAccount, String name, double initialAmount) {
		super();
		this.numberAccount = numberAccount;
		this.name = name;
		this.deposit(initialAmount);
	}

	public int getNumberAccount() {
		return numberAccount;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	
	public void withdraw(double amount) {
		this.balance = this.balance - amount - tax;
	}
	
	public String toString() {
		return "Account "
				+ this.getNumberAccount() 
				+ ", Holder: "
				+ this.getName()
				+ ", Balance: $"
				+ String.format("%.2f", this.getBalance());
	}
	
	
}
