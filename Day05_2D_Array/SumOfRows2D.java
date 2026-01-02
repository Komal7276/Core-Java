//Write a Java program to take input of 2D array and calculate the sum of each row.

import java.util.Scanner;

class SumOfRows2D
{
	public static void main(String[] args) {

		System.out.println();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Rows :");
		int rows = sc.nextInt();

		System.out.println();

		System.out.print("Enter Number of Columns : ");
		int columns = sc.nextInt();

		System.out.println();

		int arr[][] = new int[rows][columns];

		System.out.println("Enter 2D Array Elements : ");

		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}


		System.out.println();

		System.out.println("Sum of Each Row : ");

		System.out.println();

		for(int i=0; i<rows; i++)
		{
			int sum = 0;

			for(int j=0; j<columns; j++)
			{
				sum = sum + arr[i][j];
			}

			System.out.println("Row"+ (i+1) +" Sum = " +sum);
		}

	}
}