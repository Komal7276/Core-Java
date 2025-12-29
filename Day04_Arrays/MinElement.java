//Write a Java program to find smallest element in an array

import java.util.Scanner;

class MinElement
{
	public static void main(String[] args) {
		
		System.out.println("");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size of Array : ");
		int size = sc.nextInt();

		System.out.println("");

		System.out.println("Enter Elements : ");
		int arr[] = new int[size];

		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}

		int min=arr[0];

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}

		System.out.print("Min Element : "+min);
	}
}