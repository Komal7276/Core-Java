class FinallyExample1
{
	public static void main(String[] args) {
		
		try
		{
			int a = 10;
			int b = 0;

			int result = a / b;
		}

		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide by Zero");
		}

		finally
		{
			System.out.println("Finally Block always executes");
		}

		/*	This block is executed in every situation - 
			whether an exception occurs or not.
			If you have any mandatory code that must execute,
			you should write that code inside the finally block */
	}
}