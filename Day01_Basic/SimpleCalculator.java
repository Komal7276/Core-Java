import java.util.Scanner;

class SimpleCalculator
{
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);

		System.out.println("*-* -- Welcome To Simple Calculator -- *-*");
		
		System.out.println("-----------------------------------------------------------------------------");

		System.out.print("Enter First Number : ");
		double inum1 = s1.nextDouble();

		System.out.print("Enter Second Number : ");
		double inum2 = s1.nextDouble();

		System.out.println("");

		System.out.println("Choose an Operation : ");
		System.out.println("1.Addition(+)");
		System.out.println("2.Subtraction(-)");
		System.out.println("3.Multiplication(*)");
		System.out.println("4.Division(/)");

		System.out.println("");

		System.out.print("Enter Your Choice (1-4) : ");
		int choice = s1.nextInt();


		double result;

		System.out.println("");

		switch(choice)
		{
			case 1 :
				result = inum1 + inum2;
				System.out.println("Result : " + result);
				break;

			case 2 : 
				result = inum1 - inum2;
				System.out.println("Result : " + result);
				break;

			case 3: 
				result = inum1 * inum2;
				System.out.println("Result : " + result);
				break;

			case 4: 
				if(inum2 != 0)
				{
					result = inum1 / inum2;
					System.out.println("Result : " + result);
				}
				else
				{
					System.out.println("Error : Division by Zero!");
				}

				break;

			default : 
				System.out.println("Invalid Choice!!");

		}

	}
}