import java.util.Scanner;

class SimpleCalculationResult
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.print("\nEnter First Number : ");
			int a = Integer.parseInt(sc.nextLine());

			System.out.print("Enter Second Number : ");
			int b = Integer.parseInt(sc.nextLine());

			int result = a / b;
			System.out.println("\nDivision Result : "+ result);
		
			int arr[] = {10,20,30,40,50,100};

			System.out.print("\nEnter Index to Access Array : ");
			int index = Integer.parseInt(sc.nextLine());

			System.out.println("\nArray Value : "+ arr[index]);

		}

		catch(ArithmeticException e)
		{
			System.out.println("\nError : Cannot Divide By Zero");
		}

		catch(NumberFormatException e)
		{
			System.out.println("\nError : Please enter valid numeric values");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Invalid array index .");
		}

		catch(Exception e)
		{
			System.out.println("Unexpected Error: " + e.getMessage());
		}

		finally
		{
			System.out.println("Program Ended.");
		}
	}
}