import java.util.Scanner;

class StringConvert
{
	// If the given string is not a valid number (example: "abc", "12a"),
	// NumberFormatException will occur.
	static int convert(String s) throws NumberFormatException
	{
		return Integer.parseInt(s); // converts string to integer
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter a Number : ");
		String input = sc.nextLine();

		int num = convert(input);

		System.out.println("\nNumber : "+ num);
	}
}