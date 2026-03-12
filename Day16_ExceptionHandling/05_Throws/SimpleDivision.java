import java.util.Scanner;

class SimpleDivision
{
	static int divide(int ino1,int ino2) throws ArithmeticException
	{
		return ino1/ino2;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nGive First Value : ");
		int ivalue1 = sc.nextInt();

		System.out.print("Give Second Value : ");
		int ivalue2 = sc.nextInt();

		int result = divide(ivalue1,ivalue2); //If second number is 0 -> ArithmaticException Occures

		System.out.println("\nResult : "+ result);
	}
}