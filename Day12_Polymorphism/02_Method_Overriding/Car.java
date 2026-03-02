class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is Running");
	}
}

class Car extends Vehicle
{
	void run()
	{
		System.out.println("Car is Running");
	}

	public static void main(String[] args) {
		
		Vehicle obj = new Car();
		obj.run();
	}
}