package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		
		System.out.print("numero: ");
		int numberContract = sc.nextInt();
		
		System.out.println("Data (dd/MM/yyyy): ");
		LocalDateTime date = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.println("Entre com o numero de parcelas: ");
		int numberParc = sc.nextInt();
		
		sc.close();

	}

}
