class AddNumbers
{
	int add(int a, int b)
	{
		return a + b;
	}

	int add(int a, int b, int c)
	{
		return a + b + c;
	}

	double add(double a, double b)
	{
		return a + b;
	}

	public static void main(String[] args) {
		
		AddNumbers obj = new AddNumbers();

		System.out.println("Sum of 2 Integers : "+ obj.add(50,25));
		System.out.println("Sum of 3 Integers : "+ obj.add(100,200,300));
		System.out.println("Sum of 2 Double : "+ obj.add(10.5,20.5));
	}
}