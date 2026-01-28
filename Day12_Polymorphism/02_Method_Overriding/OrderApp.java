import java.util.Scanner;

class Order
{
	double amount;

	Order(double amount)
	{
		this.amount = amount;
	}

	void calculateBill()
	{
		System.out.println("Order Amount : "+ amount);
	}
}

class OnlineOrder extends Order 
{
	OnlineOrder(double amount)
	{
		super(amount);
	}

	void calculateBill()
	{
		double deliveryCharge = 100;

		System.out.println("\nOrder Type : Online Order\n");
		System.out.println("Order Amount : "+ amount);
		System.out.println("Delivery Charge : "+ deliveryCharge);
		System.out.println("\nTotal Bill : Rs/- "+ (amount + deliveryCharge));
	}
}


class StoreOrder extends Order
{
	StoreOrder(double amount)
	{
		super(amount);
	}

	void calculateBill()
	{
		double discount = amount * 0.10;

		System.out.println("\nOrder Type : Store Order\n");
		System.out.println("Order Amount : "+  amount);
		System.out.println("Discount : "+ discount);
		System.out.println("\nTotal Bill : "+ (amount - discount));
	}
} 

public class OrderApp
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Order Amount :");
		double amount = sc.nextDouble();

		System.out.println("\n\nSelect Order Type ");
		System.out.println("1.Online Order");
		System.out.println("2.Store Order");

		int choice = sc.nextInt();

		Order order;

		if(choice == 1)
		{
			order = new OnlineOrder(amount);
		}
		else
		{
			order = new StoreOrder(amount);
		}

		System.out.println("\n------ Bill Details ------");
		order.calculateBill();
	}
}