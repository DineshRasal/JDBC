package test;

public class CryptoCard implements PaymentStratergy{
	
	public void pay(int amount) {
		System.out.println("Paid"+amount);
		
	}

}
