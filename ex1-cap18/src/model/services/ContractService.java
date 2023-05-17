package model.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import model.entities.Contract;

public class ContractService {
	
	private OnlinePaymentService payment;
	private Double amount;
	private Contract contract;
	
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	
	
	public ContractService(Contract Contract, Double amount, OnlinePaymentService payment) {
		this.payment = payment;
		this.amount = amount;
		this.payment = payment;
	}

	public void processContract(Contract contract, int months) {
		
		double tax = 0;
		double paymentFee = 0;
		double installment = 0;
		
		for (int i = 0; i < months; i ++) {
			tax = payment.interest((amount / months), i + 1);
			paymentFee = payment.paymentFee(((amount / months) + tax));
			installment = ((amount / months) + tax + paymentFee);			
		}
	}
}
