class Animal 
{
	void sound()
	{
		System.out.println("Animal Males Sound");
	}
}

class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog Barks");
	}

	public static void main(String[] args) {
		
		Animal a1 = new Dog();

		a1.sound();
	}
}