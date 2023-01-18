package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int numb = sc.nextInt();
		
		double[] arr = new double[numb];
		double average = 0;
		
		int i = 0;
		
		while (i < numb) {
			double value = sc.nextDouble();
			arr[i] = value;
			average += arr[i];
			i++;
		}
				
		System.out.println("AVERAGE HEIGHT: " + average / arr.length);
		
		sc.close();
	}

}
