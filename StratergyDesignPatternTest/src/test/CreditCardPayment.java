package test;

public class CreditCardPayment implements PaymentStratergy {

	
		public void pay(int amount) {
			System.out.println("Paid"+amount);
		}
}
