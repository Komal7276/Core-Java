class CalculatorEx
{
	int add(int a,int b)
	{
		return a+b;
	}

	double add(double a,double b)
	{
		return a+b;
	}

	int add(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		
		CalculatorEx obj = new CalculatorEx();

		System.out.println(obj.add(100,20));
		System.out.println(obj.add(20.47,30.5));
		System.out.println(obj.add(5,4,6));
	}
}