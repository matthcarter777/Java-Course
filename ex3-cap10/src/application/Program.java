package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[9];
		int n = 0;
		String name;
		String email;
		int room;
		
		System.out.println("How many rooms will be rented? " );
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #"+ i + 1);
			System.out.println("Name: ");
			name = sc.next();
			System.out.println("Email: ");
			email = sc.next();
			System.out.println("Room: ");
			room = sc.nextInt();
			
			arr[room] = room + ": " + name + ", " + email;

		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
		
		
		sc.close();
	}

}
