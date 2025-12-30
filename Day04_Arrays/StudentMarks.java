//Write a Java program to store student marka and calculate total & average

import java.util.Scanner;

class StudentMarks
{
	static int calculateTotal(int marks[])
	{
		int total = 0;

		for(int m:marks)
		{
			total+=m;
		}

		return total;
	}


	public static void main(String[] args) {
		System.out.println("");

		Scanner sc = new Scanner(System.in);

		int marks[] = new int[5];

		System.out.println("Enter Marks of 5 Subjects : ");

		for(int i=0; i<marks.length; i++)
		{
			marks[i]=sc.nextInt();
		}

		int total = calculateTotal(marks);

		double average = total/5.0;

		System.out.println("Total = "+ total);
		System.out.println("Average = "+ average);
	}
}