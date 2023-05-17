package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		System.out.println("Entre os dados do contrato: ");
		
		System.out.print("numero: ");
		int numberContract = sc.nextInt();
				
		System.out.print("Data (dd/MM/yyyy): ");
		String date = sc.next();
		
		System.out.print("Valor do contrato: ");
		double valContract = sc.nextDouble();
		
		System.out.print("Entre com o numero de parcelas: ");
		int numberParc = sc.nextInt();
		
		Contract contract = new Contract(numberContract,simpleDateFormat.parse(date),valContract);
				
		ContractService contractService = new ContractService(contract, valContract, new PaypalService());
		
		contractService.processContract(contract, numberParc);
		
		System.out.println("Numero contrato " + contract.getNumber());
		
		sc.close();

	}

}
