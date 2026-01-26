import java.util.Scanner;

class Account
{
	long accountNo;
	double balance;

	void setAccount(long accNo, double bal)
	{
		accountNo = accNo;
		balance = bal;
	}
}

class SavingAccount extends Account
{
	void deposit(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
		}
		else
		{
			System.out.println("\nInvalid Deposit Amount");
		}
	}

	void display()
	{
		System.out.println("Account No : "+ accountNo);
		System.out.println("Balance : "+ balance);
	}
}

class Transaction extends SavingAccount
{
	void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("\nInsufficient Balance");
		}
	}
}

class BankAccount
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Transaction t1 = new Transaction();

		System.out.print("\nEnter Account No : ");
		long accNo = sc.nextLong();

		System.out.print("Enter Initial Balance : ");
		double bal = sc.nextDouble();

		t1.setAccount(accNo, bal);

		System.out.print("\nEnter Deposit Amount : ");
		t1.deposit(sc.nextDouble());

		System.out.print("Enter Withdraw Amount : ");
		t1.withdraw(sc.nextDouble());

		t1.display();
	}
}