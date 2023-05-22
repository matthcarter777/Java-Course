package model.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService payment;
	private Double amount;
	
	public ContractService(Contract Contract, Double amount, OnlinePaymentService payment) {
		this.payment = payment;
		this.amount = amount;
		this.payment = payment;
	}

	public void processContract(Contract contract, int months) throws ParseException {
		
		double tax = 0;
		double paymentFee = 0;
		double installmentAmount = 0;
	
		
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		
		for (int i = 0; i < months; i ++) {
			tax = payment.interest((amount / months), i + 1);
			paymentFee = payment.paymentFee(((amount / months) + tax));
			installmentAmount = ((amount / months) + tax + paymentFee);
			
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			
			cal.add(Calendar.MONTH,i);
			
			int dia = cal.get(Calendar.DAY_OF_MONTH);
			int mes = cal.get(Calendar.MONTH) + 1; // O mês começa em 0, por isso é adicionado 1
			int ano = cal.get(Calendar.YEAR);
			
			String strDate = dia + "/" + mes + "/" + ano;
			
			Installment paymentInstallment = new Installment(simpleDateFormat.parse(strDate),installmentAmount );
		
			contract.setInstallments(paymentInstallment);
		}
	}
}
