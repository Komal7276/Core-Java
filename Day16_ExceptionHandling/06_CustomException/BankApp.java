import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}


class BankApp
{

	static void withdraw(double balance, double amount) throws InsufficientBalanceException
	{
		if(amount > balance)
		{
			throw new InsufficientBalanceException("\nInsufficient Balance.");
		}

		balance = balance - amount;
		System.out.println("\nwithdraw successful");
		System.out.println("Remaining balance: " +balance);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter Balance : ");
		double balance = sc.nextDouble();

		System.out.print("Enter withdraw Amount : ");
		double amount = sc.nextDouble();

		try
		{
			withdraw(balance, amount);
		}

		catch (InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}
}