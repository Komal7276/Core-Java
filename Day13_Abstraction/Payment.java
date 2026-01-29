import java.util.Scanner;

abstract class Payments
{
	double amount;

	abstract void pay();
}

class CardPayment extends Payments
{
	@Override
	void pay()
	{
		System.out.println("Paid Rs/- "+ amount + " Using Card");
	}
}

class UPIPayment extends Payments
{
	@Override
	void pay()
	{
		System.out.println("Paid Rs/- "+ amount + " Using UPI");
	}
}


public class Payment
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Payments p;

		System.out.println("\nEnter Payment Type\n1.Card\n2.UPI");
		int type = sc.nextInt();

		sc.nextLine();

		System.out.print("\nEnter Amount to Pay : ");
		double amt = sc.nextInt();

		if(type == 1)
		{
			p = new CardPayment();
		}

		else
		{
			p = new UPIPayment();
		}

		p.amount = amt;
		p.pay();
	}
}