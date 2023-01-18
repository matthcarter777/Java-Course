package ini;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Sum sm = new Sum();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res = sm.sum(a, b);
		int res2 = sm.subtract(a, b);
		
		System.out.println("Soma: " + res);
		System.out.println("Soma: " + res2);
		
		sc.close();
	}
}
