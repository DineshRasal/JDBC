package test;

public class ShoppingCard {
	private PaymentStratergy paymentStratergy=null;
	
	
	public void setPaymentStratergy(PaymentStratergy paymentStratergy) {
		this.paymentStratergy=paymentStratergy;
	}
	
	public ShoppingCard(PaymentStratergy paymentStratergy) {
		this.paymentStratergy=paymentStratergy;
	}
	public void checkout(int amount) {
		paymentStratergy.pay(amount);
	}
}
