package entities;

import entities.enums.Color;

public class Circle extends Shape{
	
	private Double radios;
	
	 final double PI = 3.1416;
	
	public Circle() {}

	public Circle(Color color, Double radios) {
		super(color);
		this.radios = radios;
	}
	
	public Double getRadios() {
		return radios;
	}

	public void setRadios(Double radios) {
		this.radios = radios;
	}

	@Override
	public Double area() {
		return PI * (this.radios * this.radios);
	}
	
}
