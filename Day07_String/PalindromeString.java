//Palindrome String Checker--->A palindrome string is a string that reads the same backward as forward.
//ex madam, Dad, Mom, level-->its reverse is same its called Palindrom.
import java.util.Scanner;

class PalindromeString
{

	static boolean isPalindrome(String str)
	{
		String rev = "";

		for(int i =str.length()-1; i >= 0; i--)
		{
			rev= rev + str.charAt(i);
		}

		return str.equalsIgnoreCase(rev);
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter String:");
		String s =sc.nextLine();

		if(isPalindrome(s))
		{
			System.out.println("Palindrome String");
		}

		else
		{
			System.out.println("Not Palindrome");
		}
	}
}