class BankAccount
{
	long accountNumber;
	double balance;

	void setAccount(long accNo,double bal)
	{
		accountNumber=accNo;
		balance=bal;
	}

	void deposit(double amount)
	{
		balance+=amount;
	}
}



class SavingAccount extends BankAccount
{

	void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}

	}

	void display()
	{
		System.out.print("\nAccount Number :"+accountNumber);
		System.out.print("\nBalance : "+ balance);
	}


	public static void main(String[] args) {
		
		SavingAccount s1 = new SavingAccount();

		s1.setAccount(98267899,7500);
		s1.deposit(3400);
		s1.withdraw(2000);
		s1.display();
	}
}