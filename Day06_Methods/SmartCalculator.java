import java.util.Scanner;

class SmartCalculator
{

	static int calculate(int ino1,int ino2,char opr)
	{
		switch(opr)
		{
			case '+':
				return ino1+ino2;

			case '-':
				return ino1-ino2;

			case '*':
				return ino1*ino2;

			case '/':
				return ino1/ino2;

			default:
				return 0;
		}
	}




	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char choice;

		do
		{
			System.out.print("\nEnter First Number : ");
			int ino1 = sc.nextInt();

			System.out.print("Enter Second Number : ");
			int ino2 = sc.nextInt();

			System.out.print("Enter Operator(+ - * /) : ");
			char opr = sc.next().charAt(0);

			int result = calculate(ino1,ino2,opr);
			System.out.println("\nResult : "+result);

			System.out.print("\nContinue?(y/n) : ");
			choice = sc.next().charAt(0);
		}while(choice == 'y' || choice =='Y');
	}
}