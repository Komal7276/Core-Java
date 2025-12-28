//Develop a Java program that counts digits of a number without using built-in functions.

import java.util.Scanner;

class CountDigits
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("");

		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		int count = 0;

		while(num > 0)
		{
			count++;
			num = num / 10;
		}

		System.out.println("Total Digits : "+ count);

		sc.close();
	}
}