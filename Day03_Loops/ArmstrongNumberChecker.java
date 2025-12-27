//Created Armstrong number validation program

import java.util.Scanner;

class ArmstrongNumberChecker
{
 	public static void main(String[] args) {
 		
 		Scanner sc = new Scanner(System.in);

 		System.out.println("");

 		System.out.println("Enter Number : ");
 		int num = sc.nextInt();

 		int temp = num;
 		int sum = 0;

 		while(temp > 0)
 		{
 			//get last digit of number
 			int digit = temp % 10 ;

 			//add cube of digit to sum
 			sum = sum +(digit*digit*digit);

 			//remove last digit of number
 			temp = temp/10;
 		}

 		if(sum == num)
 			System.out.println("Armstrong Number");
 		else
 			System.out.println("Not an Armstrong Number");

 		sc.close();
 	}
}