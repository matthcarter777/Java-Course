package exe1;

import java.util.Scanner;

public class exe1 {
	
	public static void exemplo(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;
		System.out.println("Digite um texto");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Voce digitou:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}
	
	public static void ex1(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n1, n2, soma;
		
		System.out.println("Digite...");
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		soma = n1 + n2;
		
		
		System.out.println("Soma " + soma);
		
		sc.close();
	}
	
	public static void ex2(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double r = 100.64;
		double a = 0;
		
		System.out.println("Digite...");
		
		a = Math.pow(r, 2) * Math.PI;
		
		
		System.out.printf("Área do circulo: %.4f%n", a);
		
		sc.close();
	}
	
	public static void ex3(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a,b,c,d, diferenca;
		
		System.out.println("Digite os valores: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		diferenca = ((a * b) - (c * d));
		
		System.out.printf("Diferença: " +  diferenca);
		
		sc.close();
	}
		
}
