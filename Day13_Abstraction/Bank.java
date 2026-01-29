import java.util.Scanner;

abstract class BankAccount
{
	double balance;

	abstract void deposite(double amount);
	abstract  void  withdraw(double amount);

	void showBalance()
	{
		System.out.println("Current Balance : "+ balance);
	}
}


class SavingAccount extends BankAccount
{
	@Override
	void deposite(double amount)
	{
		balance += amount;
		System.out.println(amount + " Deposited Successfully!!");
	}

	@Override
	void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println(amount+" Withdrawn Successfully");
		}
		else
		{
			System.out.println("\nInsufficient Balance");
		}
	}
}

class Bank 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SavingAccount acc = new SavingAccount();

		System.out.print("\nEnter Deposite Amount : ");
		acc.deposite(sc.nextDouble());

		System.out.print("\nEnter Withdraw Amount : ");
		acc.withdraw(sc.nextDouble());

		acc.showBalance();
	}
}