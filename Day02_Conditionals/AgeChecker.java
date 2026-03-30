import java.util.Scanner;

class AgeChecker
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Your Age : ");
		int age = sc.nextInt();

		if(age <= 18)
		{
			System.out.println("\nYou are Teenager");
		}
		else
		{
			System.out.println("\nYou are Adult");
		}
	}
}