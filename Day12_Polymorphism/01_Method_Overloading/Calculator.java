import java.util.Scanner;

class Calculator
{
	int calculate(int a, int b, int c)
	{
		return a + b + c;
	}

	int calculate(int a, int b)
	{
		return a - b;
	}

	double calculate(double a, double b)
	{
		return a * b;
	}

	double calculate(double a, double b, double c)
	{
		return (a+b+c) / 3;
	}

	//Overload Method for Square and Cube
	int calculate(int num)
	{
		return num * num;
	}

	int calculate(int num, boolean cube)
	{
		return num * num * num;
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();

		System.out.println("\n------ Services ------\n");
		System.out.println("1.Add 3 Numbers");
		System.out.println("2.Subtract 2 Numbers");
		System.out.println("3.Multiply 2 Decimals");
		System.out.println("4.Average of 3 Decimals");
		System.out.println("5.Square of a Number");
		System.out.println("6.Cube of a Number");

		System.out.print("\nEnter Your Choice : ");
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1:
				System.out.println("Enter 3 Integers : ");
				System.out.println("Addition : "+c1.calculate(sc.nextInt(),sc.nextInt(),sc.nextInt()));
				break;

			case 2:
				System.out.println("Enter 2 Integers : ");
				System.out.println("Subtraction : "+c1.calculate(sc.nextInt(),sc.nextInt()));
				break;

			case 3:
				System.out.println("Enter 2 Decimals :");
				System.out.println("Multiplication : "+c1.calculate(sc.nextDouble(),sc.nextDouble()));
				break;

			case 4:
				System.out.println("Enter 3 Decimal Numbers : ");
				System.out.println("Average : "+c1.calculate(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
				break;

			case 5:
				System.out.print("Enter Number : ");
				System.out.println("Square : "+c1.calculate(sc.nextInt()));
				break;

			case 6:
				System.out.print("Enter Number : ");
				System.out.println("Cube : "+c1.calculate(sc.nextInt(),true));
				break;

			default:
				System.out.println("Invalid Choice");

		}
	}
}