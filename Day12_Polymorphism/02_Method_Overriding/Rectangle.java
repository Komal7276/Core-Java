class Shape 
{
	void draw()
	{
		System.out.println("Drawing Shape");
	}
}

class Circle extends Shape
{
	//Overriding draw() method
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}

class Rectangle extends Shape
{
	//Overriding draw() method
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}


	public static void main(String[] args) {
		
		Shape s;

		//Runtime polymorphism: Circle object
		s = new Circle();
		s.draw();  //Calls Circle's draw()


		//Runtime polymorphism: Rectangle object
		s = new Rectangle();
		s.draw();  //Calls Reactangle's draw()

	}

}