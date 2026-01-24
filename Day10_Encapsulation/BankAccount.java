//Created BankAccount class using encapsulation with private fields, setters, getters, and basic deposit logic


import java.util.Scanner;

class BankAccount
{
	private long accountNo;
	private String holderName;
	private double balance;
	private double currentBill;


	public void setAccountNo(long accNo)
	{
		this.accountNo = accNo;
	}

	public long getAccountNo()
	{
		return accountNo;
	}

	public void setHolderName(String name)
	{
		this.holderName = name;
	}

	public String getHolderName()
	{
		return holderName;
	}

	public void setBalance(double account)
	{
		this.balance =balance;
	}

	public double getBalance()
	{
		return balance;
	}


	//Methods
	public void setCurrentBill(double bill)
	{
		if(bill >= 0)
		{
			currentBill = bill;
		}
		else
		{
			System.out.println("\nInvalid Bill Amount");
		}
	}


	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance+=amount;
		}
		else
		{
			System.out.println("\nInvalid Deposit Amount");
		}
	}

	public void withdraw(double amount)
	{
		if(amount >0 && amount <= balance)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("\nInsufficient Balance or Invlaid Amount");
		}
	}


	public void display()
	{
		System.out.println("Account Number :" + accountNo);
		System.out.println("Holder Name :"+ holderName);
		System.out.println("Balance :"+ balance);
		System.out.println("Current Bill : "+ currentBill);
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BankAccount ac = new BankAccount();

		int choice;

		System.out.print("\nEnter Account Number : ");
		ac.setAccountNo(sc.nextInt());

		sc.nextLine();

		System.out.print("Enter Holder Name : ");
		ac.setHolderName(sc.nextLine());

		System.out.print("Enter Account Balance : ");
		ac.setBalance(sc.nextDouble());

		//sc.nextLine(); 	

		do
		{
			System.out.println("\n\n**   Services  **");
			System.out.println("\n1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Add Current Bill");
			System.out.println("4.Display Account");
			System.out.println("5.Exit");

			System.out.print("\nEnter Choice :");
			choice = sc.nextInt();


			switch(choice)
			{
				case 1:
					System.out.print("\nEnter Deposit Amount : ");
					ac.deposit(sc.nextDouble());
					break;

				case 2:
					System.out.print("\nEnter Withdraw Amount :");
					ac.withdraw(sc.nextDouble());
					break;

				case 3:
					System.out.print("Enter Current Bill Amount : ");
					ac.setCurrentBill(sc.nextDouble());
					break;

				case 4:
					ac.display();
					break;

				case 5:
					System.out.println("\nThank You!!");
					break;

				default:
					System.out.println("\nInvalid Choice");
			}
		}while(choice != 5);

	}
}