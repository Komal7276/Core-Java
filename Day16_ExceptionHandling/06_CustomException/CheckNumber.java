import java.util.Scanner;

class NegativeNumberException extends Exception
{
	NegativeNumberException(String msg)
	{
		super(msg);
	}

}

class CheckNumber
{
	static void NumberCheck(int number) throws NegativeNumberException
	{
		if(number < 0)
		{
			throw new NegativeNumberException("\nNegative number not allowed");
		}

		System.out.println("\nValid Number");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter Number : ");
		int number = sc.nextInt();

		try
		{
			NumberCheck(number);
		}

		catch (NegativeNumberException e)
		{
			System.out.println(e.getMessage());
		}
	}

}