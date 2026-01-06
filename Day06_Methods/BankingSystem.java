import java.util.Scanner;

class BankingSystem
{

	static double balance = 5000;	//Initial Balance

	static void deposit(double amount)
	{
		if(amount > 0)
		{
			balance = balance+amount;
			System.out.println("Amount Deposited Successfully!!");
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}

	static void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Insufficient Balance");
		}
		else if(amount<=0)
		{
			System.out.println("Invalid Amount");
		}
		else
		{
			balance = balance -amount;
			System.out.println("Withdrawal Successful!!");
		}
	}


	static void checkBalance()
	{
		System.out.print("Current Balance : "+balance);
	}



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int choice;

		do{
			System.out.println("\n----------Banling Menu----------");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");

			System.out.print("\nEnter Choice : ");
			choice = sc.nextInt();

			switch(choice)
			{
				case 1 :
					System.out.print("\nEnter Deposit Amount :");
					double depositAmount = sc.nextDouble();

					deposit(depositAmount);
					break;

				case 2 :
					System.out.print("\nEnter Withdrawal Amount : ");
					double withdrawAmount = sc.nextDouble();

					withdraw(withdrawAmount);
					break;

				case 3 :
					checkBalance();
					break;


				case 4:
					System.out.println("Thank You for Using Banking System");
					break;

				default:
					System.out.println("Invalid Choice ");
			}
		}while(choice != 4);

		sc.close();
	}
}