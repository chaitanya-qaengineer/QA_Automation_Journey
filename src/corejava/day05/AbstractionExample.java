package corejava.day05;

public class AbstractionExample {

	public static void main(String[] args) {
		CreditCardPayment pay = new CreditCardPayment();
		pay.makePayment();
		
		UPIPayment pay1 = new UPIPayment();
		pay1.makePayment();
		

	}

}
