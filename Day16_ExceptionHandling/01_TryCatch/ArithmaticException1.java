class ArithmaticException1
{
	public static void main(String[] args) {
		
		int numerators[] = {40,33,88,100,50};
		int denominators[] = {5,3,0,5,2};

		for(int i=0; i<numerators.length; i++)
		{
			//Calling divide method
			//When i = 2 -> 88/0
			//Division by zero causes ArithmaticException
			System.out.println(divide(numerators[i],denominators[i])); //Exception in thread "main" java.lang.ArithmaticException: / by zero

		}

		//This line will not execute because program stops when exception occurs
		System.out.println("Continue...");
	}

	public static int divide(int a, int b)
	{
		try 
		{
			return a / b;
		}

		catch(ArithmeticException e)
		{
			//This block run when b = 0
			System.out.println("Cannot divide by zero");
			return 0;
		}
	}
}