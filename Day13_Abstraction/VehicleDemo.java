import java.util.Scanner;

//Abstract Class
abstract class Vehicle
{
	//Abstract Methods ----->>Without Body
	abstract void start();
	abstract void stop();
}

class Car extends Vehicle
{
	@Override
	void start()
	{
		System.out.println("\nCar Started with Key");
	}

	@Override
	void stop()
	{
		System.out.println("Car Stopped using Brake");
	}
}

class Bike extends Vehicle
{
	@Override
	void start()
	{
		System.out.println("\nBike Started with Key");
	}

	@Override
	void stop()
	{
		System.out.println("Bike Stopped using Brake");
	}
}


class VehicleDemo
{
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);

		System.out.println("\nChoose Vehicle\n1.Car\n2.Bike\n");
		int choice = sc.nextInt();

		Vehicle v;

		if(choice == 1)
		{
			v = new Car(); //Car Class Call
		}
		else
		{
			v = new Bike(); //Bike Class Call
		}

		v.start();
		v.stop(); 	
	}
}