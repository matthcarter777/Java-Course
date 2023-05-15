package model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(double amount) {
		double valuePercent = (amount / 100);
		return valuePercent * 2;
	}

	@Override
	public Double interest(double amount, int months) {
		double valuePercent = (amount / 100);
		
		return valuePercent * months;
	}

}
