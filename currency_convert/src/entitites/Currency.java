package entitites;

public class Currency {
	public static double value;
	public static double bas;
	
	
	public static double currencyConverter() {
		double tax = (((value * bas) / 100) * 6);
		
		return value * bas + tax;
	}
}
