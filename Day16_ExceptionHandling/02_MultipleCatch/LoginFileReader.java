import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class LoginFileReader
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.print("\nEnter Your User ID : ");
			int userId = Integer.parseInt(sc.nextLine());

			System.out.print("Enter File Name to Read : ");
			String fileName = sc.nextLine();

			File file = new File(fileName);
			Scanner fileScanner = new Scanner(file);

			System.out.println("File Content");

			while(fileScanner.hasNextLine())
			{
				System.out.println(fileScanner.nextLine());
			}
		}

		catch(NumberFormatException e)
		{
			System.out.println("\nError : User ID must be a number");
		}

		catch(FileNotFoundException e)
		{
			System.out.println("\nError : File Not Found");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("\nError : Null Value encountered");
		}

		catch(Exception e)
		{
			System.out.println("\nUnexpected Error: "+e.getMessage());
		}

		finally
		{
			System.out.println("\nLogin Process Completed.");
		}

	}
}