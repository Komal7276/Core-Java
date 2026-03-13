abstract class RemoteControl
{
	abstract void startEngine();

	void checkBattery()
	{
		System.out.println("\nRemote Battery : 90%");
	}n
}

class MyBikeRemote extends RemoteControl
{
	void startEngine()
	{
		System.out.println("Bike Engine Started Wirelessly");
	}
}

class BikeSystem
{
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new MyBikeRemote();

		remoteControl.checkBattery();
		remoteControl.startEngine();
	}
}