import java.util.Scanner;

class Vehicle
{
	String brand;
	int speed;

	void setVehicle(String brand, int speed)
	{
		this.brand = brand;
		this.speed = speed;
	}
}

class Car extends Vehicle
{
	int gears;

	void setCarDetails(int gears)
	{
		this.gears = gears;
	}

	void display()
	{
		System.out.println("\n--------Car Details--------");
		System.out.println("\nBrnad : "+ brand);
		System.out.println("Speed : "+ speed);
		System.out.println("Gears : "+ gears);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Car c1 = new Car();

		System.out.print("\nEnter Car Brand : ");
		String brand = sc.nextLine();

		System.out.print("Enter Speed : ");
		int speed = sc.nextInt();

		System.out.print("Enter Number of Gears : ");
		int gears = sc.nextInt();

		c1.setVehicle(brand,speed); 	//Parent Method
		c1.setCarDetails(gears); 		//Child Methid
		c1.display();
	}
}