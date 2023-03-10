package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		String name;
		int idade;
		double altura;
		double sumPersonAge = 0;
		double ageDownNumber = 0;

		
		
		Person[] arr = new Person[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:" );
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			
			Person person = new Person(name, idade, altura);
			
			arr[i] = person;
		}
		
		for (int i =0; i < arr.length; i++) {
			sumPersonAge = sumPersonAge + arr[i].getAltura();
			if (arr[i].getIdade() < 16) {
				ageDownNumber++;
			}
		}
		
 		
		System.out.println();
		System.out.println("Altura média: %.2f" + (sumPersonAge / n));
		System.out.println("Pessoas com menos de 16 anos: " + ((100.0 / n) * ageDownNumber) + "%" );
		
		sc.close();
	}

}
