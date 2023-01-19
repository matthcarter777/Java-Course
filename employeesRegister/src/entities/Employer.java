package entities;

public class Employer {
	Integer id;
	String name;
	Double salary;
	
	public Employer(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}


	public void alterSalary(Double increment) {
		double basIncrement = ( salary / 100) * increment;
		this.salary = salary + basIncrement; 
	}
	
	public String getInformations() {
		return this.getId() + ", " + this.getName() + ", " + this.getSalary();
	}
	
}
