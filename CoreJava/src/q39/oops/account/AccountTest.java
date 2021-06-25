package q39.oops.account;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
	    //Get user inputs to create new account
		System.out.println("Enter the Account Number");
	    String accountNumber = userInput.next();
	    System.out.println("Enter the Account Balance");
	    int balance = userInput.nextInt();
	    
	    //New account creation
	    Account account = new Account(accountNumber, balance);
	    
	    //Display transaction menu
	    System.out.println("-------------------------------");
	    System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
	    int menuOption = userInput.nextInt();
	    
	    int transactionAmount = 0;
	    
	    //do the transaction on newly created account based on user option
	    if (menuOption == 1) {
	    	System.out.println("Enter the amount to deposit");
	    	transactionAmount = userInput.nextInt();
	    	account.deposit(transactionAmount);
		}else if (menuOption == 2) {
			System.out.println("Enter the amount to withdraw");
	    	transactionAmount = userInput.nextInt();
	    	account.withdraw(transactionAmount);
		}else {
			System.out.println("Invalid Option...Try(Run) Again");
		}

	}

}
