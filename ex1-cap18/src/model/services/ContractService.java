package model.services;

import model.entities.Contract;

public class ContractService {
	
	private OnlinePaymentService payment;
	private Double amount;
	private Contract contract;
	
	
	public ContractService(Contract Contract, Double amount, OnlinePaymentService payment) {
		this.payment = payment;
		this.amount = amount;
		this.payment = payment;
	}

	public void processContract(Contract contract, int months) {
		
		double test = payment.interest(200, months);
		
		double test2 = payment.paymentFee(202);
		
		System.out.println("Interes: " + test);
		System.out.println("PaymentFee: " + test2);
	}
}
