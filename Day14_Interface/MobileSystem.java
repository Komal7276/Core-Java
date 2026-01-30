
//Interface representing Camera Functionality
//Used to Achieve Abstraction
interface Camera
{
	void takePhoto();
}


//Interface representing music playing functionality
//Helps in achieving multiple inheritance in java
interface MusicPlayer
{
	void playMusic();
}

//Mobile class implements multiple interfaces
//This demonstrates multiple inheritance using interfaces
class Mobile implements Camera,MusicPlayer
{
	public void takePhoto()
	{
		System.out.println("Photo Clicked");
	}

	public void playMusic()
	{
		System.out.println("Music Played");
	}
}


public class MobileSystem
{
	public static void main(String[] args) {
		
		Mobile m = new Mobile();

		m.takePhoto();
		m.playMusic();
	}
}