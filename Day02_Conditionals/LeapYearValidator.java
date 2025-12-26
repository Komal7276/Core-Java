//Write a Java program to check whether a given year is a leap year or not using conditional statement.

import java.util.Scanner;

class LeapYearValidator 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("");

		System.out.print("Enter Year : ");
		int year = sc.nextInt();

		if(year % 4 == 0 && year % 100 != 0  || year % 400 == 0){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not a Leap Year");
		}
	}
}