package test;

public class AppTest {
	
	public static void main(String args[]) {
		ShoppingCard cart=new ShoppingCard();
		
		//Pay using CreditCard
		cart.setPaymentStratergy(new PayPalPayment());
		cart.checkout(100);
	}
}		
