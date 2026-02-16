package test;

public class PayPalPayment implements PaymentStratergy{
	
	public void pay(int amount) {
		System.out.println("Paid"+amount);
	}

}
