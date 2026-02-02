import java.util.Scanner;

interface MeterValidation
{
	boolean validateMeter(int meterNo);
}

interface BillCalculation
{
	double calculateBill(int units);
}

interface Subsidy
{
	double applySubsidy(double amount, int units);
}

interface Display
{
	void displayBill(double amount);
}


class ElectricitySystem implements MeterValidation,BillCalculation,Subsidy,Display
{
	public boolean validateMeter(int meterNo)
	{
		return meterNo > 0;
	}

	public double calculateBill(int units)
	{
		if(units <= 100)
		{
			return units * 10;
		}

		else if(units <= 300)
		{
			return units * 12;
		}

		else
		{
			return units * 20;
		}
	}

	public double applySubsidy(double amount, int units)
	{
		if(units <= 100)
		{
			return amount - 50;
		}

		return amount;
	}

	public void displayBill(double amount)
	{
		System.out.println("\nTotal Electricity Bill : "+ amount);
	}
}


public class ElectricityBill 
{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ElectricitySystem eb = new ElectricitySystem();

		System.out.print("\nEnter Meter Number : ");
		int meterNo = sc.nextInt();

		System.out.print("Enter Units Consumed : ");
		int units = sc.nextInt();


		if(!eb.validateMeter(meterNo))
		{
			System.out.println("\nInvalid Meter Number");
			return;
		}	

		double amount = eb.calculateBill(units);
		amount = eb.applySubsidy(amount,units);

		eb.displayBill(amount);
	}
}