package entitites;

public class BussinesAccount extends Account {
	
	private double loanLimit;
	
	public BussinesAccount() {
		super();
	}
	
	public BussinesAccount(Integer number, String holder, Double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public void load(double amount) {
		if (amount <= this.loanLimit) {
			this.deposit(amount);
		}
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		this.balance -= 2.0;
	}
	
}
