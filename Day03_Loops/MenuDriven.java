//Write a Java program to perform menu-driven operations such as reversing a number and
// finding the sum of digits using loops.

import java.util.Scanner;

class MenuDriven
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice,num;

		do{

			System.out.println("\nChoose Menu No");
			System.out.println("\n 1.Reverse Number");
			System.out.println("2.Sum of Digits");
			System.out.println("3.Exit");

			System.out.print("Enter Choice : ");
			choice = sc.nextInt();

			if(choice == 1)
			{
				System.out.print("\nEnter Number : ");
				num = sc.nextInt();

				int reverse = 0;

				while(num > 0)
				{
					reverse = reverse * 10 +(num % 10);
					num/=10;

				}

				System.out.println("\nReverse Number : "+reverse);
			}

			else if(choice == 2)
			{
				System.out.print("Enter Number : ");
				num = sc.nextInt();

				int sum = 0;

				do{
					sum = sum + num % 10;
					num/=10;
				}while(num > 0);

				System.out.print("\nSum of Number : "+sum);
			}
		}while(choice != 3);

		sc.close();
	}
}