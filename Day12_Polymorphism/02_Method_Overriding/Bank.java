import java.util.Scanner;

class Bank
{
	double getInterestRate()
	{
		return 5.0;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Bank b1;

		System.out.println("\n------ Choose Bank ------");
		System.out.println("1.SBI");
		System.out.println("2.HDFC");

		int choice = sc.nextInt();

		if(choice == 1)
		{
			b1 = new SBI();
			System.out.println("SBI Interest Rate : "+ b1.getInterestRate() + "%");
		}

		else if(choice == 2)
		{
			b1 = new HDFC();
			System.out.println("HDFC Interest Rate : "+ b1.getInterestRate() +"%");
		}

		else
		{
			System.out.println("Invalid Choice");
		}

		sc.close();

	}
}


class SBI extends Bank
{
	double getInterestRate()
	{
		return 6.5;
	}
}

class HDFC extends Bank
{
	double getInterestRate()
	{
		return 7.0;
	}
}