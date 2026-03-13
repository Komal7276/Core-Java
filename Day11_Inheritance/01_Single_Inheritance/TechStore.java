class Device
{
	String brand = "Universal Tech";

	void powerOn()
	{
		System.out.println("\nDevice is Starting up...");
	}
}

class SmartPhone extends Device
{
	String model = "Galaxy s23";

	void showDetails()
	{
		System.out.println("\nBrand : "+ brand);
		System.out.println("Model : "+ model);
	}
}


class TechStore
{
	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone();

		myPhone.powerOn();
		myPhone.showDetails();
	}
}