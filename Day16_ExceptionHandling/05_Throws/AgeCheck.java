import java.util.Scanner;

class AgeCheck
{
	static void checkAge(int age) throws ArithmeticException
	{
		//If age is less than 18 , the method will throw an ArithmaticException
		if(age < 18)
		{
			throw new ArithmeticException("\nAge is less than 18");
		}

		System.out.println("\nEligible");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Age : ");
		int age = sc.nextInt();

		checkAge(age);
	}

}