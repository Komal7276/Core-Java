import java.util.Scanner;

class FinallyExample5
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.print("Enter a number : ");
			int num = Integer.parseInt(sc.nextLine());

			System.out.println("You Entered : "+ num);
		}

		catch(NumberFormatException e)
		{
			System.out.println("Invalid Number Format");
		}

		finally
		{
			System.out.println("Scanner Closed in Finally Block");
		}

	}
}