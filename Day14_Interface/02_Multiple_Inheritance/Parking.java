import java.util.Scanner;

interface VehicleValidation
{
	boolean isValidVehicle(String type);
}

interface SlotAvailability
{
	boolean checkSlotAvailability(String type);
}

interface ChargeCalculation
{
	double calculateCharge(String type, int hours, boolean isVIP);
}

interface ParkingNotification
{
	void notifyUser(String message);
}


class ParkingSystem implements VehicleValidation, SlotAvailability, ChargeCalculation, ParkingNotification	
{

	private int carSlots = 5;
	private int bikeSlots = 5;

	public boolean isValidVehicle(String type)
	{
		return type.equalsIgnoreCase("car") || 
				type.equalsIgnoreCase("bike");
	}


	public boolean checkSlotAvailability(String type)
	{
		if(type.equalsIgnoreCase("car"))
		{
			return carSlots > 0;
		}
		else
		{
			return bikeSlots > 0;
		}
	}


	public double calculateCharge(String type, int hours, boolean isVIP)
	{
		double hourlyRate = type.equalsIgnoreCase("car") ? 90 : 20;

		double amount = hourlyRate * hours;

		if(isVIP)
		{
			amount = amount * 0.80;
		}

		return amount;
	}

	public void notifyUser(String message)
	{
		System.out.println(message);
	}

	public void allocationSlot(String type)
	{
		if(type.equalsIgnoreCase("car"))
		{
			carSlots --;
		}
		else
		{
			bikeSlots --;
		}
	}


	public void displayRemainingSlots()
	{
		System.out.println("\nRemaining Car Slots : "+ carSlots);
		System.out.println("Remaining Bike Slots : " + bikeSlots);
	}

}



class  Parking
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ParkingSystem parking = new ParkingSystem();

		System.out.print ("\nEnter Vehicle Type (Car/Bike) : ");
		String type = sc.nextLine();

		System.out.print ("Enter Parking Duration (Hours) : ");
		int hours = sc.nextInt();

		System.out.print("VIP Customer ? (true/false) : ");
		boolean isVIP = sc.nextBoolean();


		if(!parking.isValidVehicle(type))
		{
			parking.notifyUser("\nInvalid Vehicle Type");
			return;
		}

		else if(!parking.checkSlotAvailability(type))
		{

			parking.notifyUser("\nNo Parking Slot Available!");
			return;
		}

		parking.allocationSlot(type);

		double charge = parking.calculateCharge(type ,hours, isVIP);

		parking.notifyUser("\n Parking Slot Allocates Succesfully..!\n");

		System.out.println("Vehicle Type: "+type);
		System.out.println("Parking Time : "+ hours + "hours");
		System.out.println("Total Charge: " + charge);

		parking.displayRemainingSlots();

	}
}