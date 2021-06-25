package q39.oops.account;

public class Account {
	
	private String accountNumber;
	private int balance;
	
	Account(String accountNumber, int balance){
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int transactionAmount) {
		balance = balance + transactionAmount;
		System.out.println("Your balance after the transaction is:" + balance);
	}
	
	public void withdraw(int transactionAmount) {
		
		if ((balance-transactionAmount) < 0) {
			System.out.println("Insufficient Balance, "
					+ "Your balance after the transaction is: "+ (transactionAmount-balance));
		}else {
			balance = balance-transactionAmount;
			System.out.println("Your balance after the transaction is:" + balance);
		}
	}

}
