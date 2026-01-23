import java.util.Scanner;

class BankAccount
{
	long accountNo;
	String holderName;
	double balance;

	//Method to display account details
	void display()
	{
		System.out.println("\nAccount Number : "+ accountNo);
		System.out.println("Account Holder Name : "+ holderName);
		System.out.println("Balance : "+ balance);
	}


	//Method to deposit amount
	void deposit(double amount)
	{
		balance += amount;
		System.out.println("Amount Deposited : "+ amount);
	}


	//BankAccount
	void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println("Amount Withdrawn : "+ amount);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankAccount acc = new BankAccount();

		System.out.print("Enter Account Holder Name : ");
		acc.holderName = sc.nextLine();

		System.out.print("Enter Account Number:");
		acc.accountNo = sc.nextLong();

		System.out.print("Enter Initial Balance: ");
		acc.balance = sc.nextDouble();

		System.out.print("Enter Amount to Deposit:");			double dep = sc.nextDouble();
		acc.deposit(dep);

		System.out.print("Enter Amount to Withdraw:");
		double wit = sc.nextDouble();
		acc.withdraw(wit);
	
		System.out.print("\nFinal Account Details:");
		acc.display();
	}
}