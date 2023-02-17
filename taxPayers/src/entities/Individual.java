package entities;

public class Individual extends Tax {
	
	private Double healthExpenditures;
	
	public Individual() {}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double paid() {
		
		if (this.anualIncome > 20000.00) {
			return (((this.anualIncome / 100) * 25) - ((this.healthExpenditures /100) * 50));
		} else {
			return (((this.anualIncome / 100) * 15) - ((this.healthExpenditures /100) * 50));
		}
	}

}
