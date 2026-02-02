import java.util.Scanner;

interface EligibilityCheck
{
	boolean checkEligibility(int year);
}

interface FeeVerification
{
	boolean verfifyFee(boolean feePaid);
}

interface RoomAllocation
{
	String allocateRoom(String gender, int year);
}

interface Notification
{
	void notifyStudent(String message);
}


class HostelSystem implements EligibilityCheck,FeeVerification,RoomAllocation,Notification
{
	int boysRooms = 2;
	int girlsRooms = 2;

	public boolean checkEligibility(int year)
	{
		return year >= 1 && year <= 4;
	}

	public boolean verfifyFee(boolean feePaid)
	{
		return feePaid;
	}

	public String allocateRoom(String gender,int year)
	{
		if(gender.equalsIgnoreCase("female") && girlsRooms > 0)
		{
			girlsRooms--;

			return (year == 4) ? "\nG-Block Priority Room" : "\nG-Block Standard Room";
		}

		if(gender.equalsIgnoreCase("male") && boysRooms > 0)
		{
			boysRooms--;

			return (year == 4) ? "\nB-Block Priority Room" : "\nB-Block Standard Room";
		}

		return "\nNo Rooms Available";
	}


	public void notifyStudent(String message)
	{
		System.out.println(message);
	}
}



public class Hostel 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		HostelSystem system = new HostelSystem();


		System.out.print("\nEnter Student Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Gender (Female/Male) : ");
		String gender = sc.nextLine();

		System.out.print("Enter Year (1-4) : ");
		int year = sc.nextInt();

		System.out.print("Fee Paid? (true/false) : ");
		boolean feePaid = sc.nextBoolean();


		if(!system.checkEligibility(year))
		{
			system.notifyStudent("\nInvalid Academic Year");
            return;
		}

		if(!system.verfifyFee(feePaid))
		{
			system.notifyStudent("Room Allocation Failed: Fee not Paid");


			return;
		}

		String room = system.allocateRoom(gender,year);

		if(room.equals("No Roooms Available"))
		{
			system.notifyStudent("\nSorry "+ name+ " ,hostel is full");
		}
		else
		{
			system.notifyStudent("\nRoom Allocated Successfully..!");

			System.out.println("Student Name : "+ name);
			System.out.println("Allocated Room : "+ room);
		}

	}
}