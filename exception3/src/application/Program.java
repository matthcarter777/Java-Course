package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
			System.out.print("Room number: ");
			int number = sc.nextInt();
			
			System.out.println("Check-in date (dd/MM/yyyy): ");
			Date checkin = sdf.parse(sc.next());
			
			System.out.println("Check-out date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(sc.next());
			
			Reservation reservation =  new Reservation(number, checkin, checkout);
			
			System.out.println(reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());
			
			
			reservation.updateDates(checkin, checkout);
			
			System.out.println(reservation);
			sc.close();
		} catch (ParseException err) {
			System.out.println("Invalid date format");
		} catch (IllegalArgumentException err) {
			System.out.println(err);
		} catch (DomainException err) {
			System.out.println("Esse: " + err.getMessage());
		} catch (RuntimeException err) {
			System.out.println("Unexpected error");
		}
		
	}

}
