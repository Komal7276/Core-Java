import java.util.Scanner;

abstract class Shapes
{
	abstract void area();
}

class Circle extends Shapes
{
	double radius;

	Circle(double r)
	{
		this.radius = r;
	}

	@Override
	void area()
	{
		System.out.println("\nCircle Area : "+(3.14 * radius * radius));
	}
}


class Rectangle extends Shapes
{
	double length;
	double width;

	Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}

	@Override
	void area()
	{
		System.out.println("\nRectangle Area : "+ (length * width));
	}
}


class Shape 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("\nChoose Shape \n1.Circle\n2.Rectangle");
		int choice = sc.nextInt();

		Shapes s;

		if(choice == 1)
		{
			System.out.print("\nEnter Radius : ");
			double r = sc.nextDouble();

			s = new Circle(r);
		}

		else
		{
			System.out.println("\nEnter Length & Width : ");
			double l = sc.nextDouble();
			double w = sc.nextDouble();

			s = new Rectangle(l,w);
		}

		s.area();
	}
}