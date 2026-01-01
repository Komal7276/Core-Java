//Find Factorial of a Number using While Loop

import java.util.Scanner;

class Factorial 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");

		System.out.print("Enter Number to Find Factorial :");
		int num = sc.nextInt();

		int fact = 1;
		
		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
		}

		System.out.println("Factorial Of "+ num + " is " +fact);

		sc.close();
	}
}