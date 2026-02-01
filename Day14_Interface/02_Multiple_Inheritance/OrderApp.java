import java.util.Scanner;

interface Order
{
	void createOrder(String item);
}

interface Payment
{
	boolean makePayment(double amount);
}

interface Delivery
{
	void deliver();
}


class OrderSystem implements Order,Payment,Delivery 
{
	public void createOrder(String item)
	{
		System.out.println("\nOrder Created for " + item);
	}

	public boolean makePayment(double amount)
	{
		return amount >= 200;
	}

	public void deliver()
	{
		System.out.println("\nOrder Delivered");
	}
}


public class OrderApp
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		OrderSystem order = new OrderSystem();

		System.out.print("\nEnter item name : ");
		String item = sc.nextLine();

		System.out.print("Enter amount : ");
		double amount = sc.nextDouble();

		order.createOrder(item);

		if(order.makePayment(amount))
		{
			order.deliver();
		}
		else
		{
			System.out.println("\nPayment Failed");
		}
	}
}