import java.util.Scanner;

class Account
{
	private double balance;

	Account(double balance)
	{
		this.balance = balance;
	}

	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
			System.out.println("\nDeposited : "+ amount);
		}
	}

	public double getBalance()
	{
		return balance;
	}
}

class ATMSystem
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Initial Balance : ");
		double initialBalance = sc.nextDouble();

		System.out.print("Enter Deposit Amount :");
		double depositAmount = sc.nextDouble();

		Account acc = new Account(initialBalance);
		acc.deposit(depositAmount);

		System.out.println("Current Balance : "+ acc.getBalance());
	}
}