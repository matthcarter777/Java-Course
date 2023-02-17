package entities;

public class Company extends Tax{
	
	private Integer numberEmployees;
		
	public Company() {}
	
	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double paid() {
		return ( this.anualIncome / 100) * 14;
	}

}
