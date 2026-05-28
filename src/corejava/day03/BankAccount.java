package corejava.day03;

  public class BankAccount {
	private String accountHolder;
	private float balance;
	
	public void deposit(float amount) {
		balance = balance+amount;
		System.out.println("The amount of deposit is :" +balance );
		
	}
	public void withdraw(float amount) {
		balance = balance-amount;
		System.out.println("The amount after withdrawl is :" +balance);
	}
	
	public void checkBalance() {
		System.out.println("The balance in the account is :" +balance);

	}
	
	    public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.deposit(5000);
		bank.withdraw(2000);
		bank.checkBalance();
		
		}

}
