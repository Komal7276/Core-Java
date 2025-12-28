//Explain how a do-while loop can be used to process digits of a number and compute their sum


import java.util.Scanner;

class SumOfDigits
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("");

		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		int sum = 0;

		do{
			sum = sum + (num % 10);
			num = num / 10;
		}while(num > 0);

		System.out.println("Sum of Digits : "+sum);

		sc.close();


	}
}