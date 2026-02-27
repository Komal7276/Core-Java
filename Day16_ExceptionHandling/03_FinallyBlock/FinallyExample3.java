class FinallyExample3
{
	public static void main(String[] args) {
		
		System.out.println(check());
	}

	static int check()
	{
		try
		{
			System.out.println("Inside try block");
			return 100; //Returning value from try block
		}

		finally
		{
			// This block executes even before returning the value
			System.out.println("Finally Block Executed Before Returning Value");
		}

		/* Even though return statement is inside try block,
		finally block executes first and then the value is returned. */
	}
}