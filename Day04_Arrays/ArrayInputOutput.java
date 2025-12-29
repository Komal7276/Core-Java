//Write a Java program to store and display elements of an array.

import java.util.Scanner;

class ArrayInputOutput
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();

		System.out.println("");

		int[] arr =new int[size];


		System.out.println("Enter array elements : ");

		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}


		System.out.println("\nArray Elements are : ");

		for(int i=0; i<size; i++)
		{
			System.out.println(arr[i] +"");
		}

	}
}