//Created program to verify palindrome numbers

import java.util.Scanner;

class NumberPalindromeChecker
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("");

		System.out.println("Enter number : ");
		int num = sc.nextInt();

		int original = num;
		int reverse = 0;

		while(num > 0)
		{
			reverse = reverse * 10 + (num % 10);
			num /= 10;
		}

		if(reverse == original)
			System.out.println("Palindrome Numner");
		else
			System.out.println("Not a Plaindrome");


		sc.close();
	}
}