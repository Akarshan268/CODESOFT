                                          //ATMInterface project in java

import java.util.Scanner;

//BankAccount class to store balance and perform transactions

class BankAccount
{
	private double balance;
	
	//Constructore to initialize balanceA
	public BankAccount(double initialBalance)
	{
		this.balance = initialBalance;
	}
	
	//Method to check Balance
	public double getBalance()
	{
		return balance;
	}
	
	//Method to deposit balance
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance += amount;
		    System.out.println("Successfully deposited: $" + amount);
		}else{
			System.out.println("Invalid deposit amount.");
	}}
	
	//Method to withdraw balance
	public boolean withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance -= amount;
			System.out.println("Successfully Withdrawn: $" + amount);
			return true;
		}else{
			System.out.println("Insufficiant balance or invalid balance");
			return false;
		}
	}
}

//ATM class to interact with BankAccount
class ATM{
	private BankAccount userAccount;
	
	//Constructor to link ATM with user's BankAccount
	public ATM(BankAccount account)
	{
		this.userAccount = account;
	}
	
	//Method to check balance
	public void checkBalance()
	{
		System.out.println("Current balance: $" +userAccount.getBalance());
	}
	
	//Method to deposit money
	public void deposit(double amount)
	{
		userAccount.deposit(amount);
	}
	
	//Method to withdraw money
	public void withdraw(double amount)
	{
		userAccount.withdraw(amount);
	}
}

//Main class to handle ATM interface
public class ATMInterface
{
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		//Creating a BankAccount with a balance of $1000
		BankAccount myAccount = new BankAccount(1000.0);
		ATM atm = new ATM(myAccount);
		
		while(true)
		{
			//Displaying ATM options
			System.out.println("\n--- ATM INTERFACE ---");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit Balance");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Exit");
			System.out.println("Choose an option: ");
			
			int choice = scanner.nextInt();
			
			//Handling user choices
			switch(choice)
			{
				case 1:
				atm.checkBalance();
				break;
				
				case 2:
				System.out.println("Enter deposit amount: ");
				double depositAmount = scanner.nextDouble();
				atm.deposit(depositAmount);
				break;
				
				case 3:
				System.out.println("Enter withdrawal amount: ");
				double withdrawAmount = scanner.nextDouble();
				atm.withdraw(withdrawAmount);
				break;
				
				case 4:
				System.out.println("Thank you for using the ATM. Goodbye!");
				scanner.close();
				return;
				default:
				
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}
	}
}