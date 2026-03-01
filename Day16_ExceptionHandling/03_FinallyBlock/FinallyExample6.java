class FinallyExample6
{
	public static void main(String[] args) {
		
		System.out.println("Result : "+ testMethod());
	}

	static int testMethod()
	{
		try
		{
			int a = 50;
			int b = 2;

			int result = a / b;

			return result;
		}

		catch(Exception e)
		{
			System.out.println("Exception Occured");

			return -1;
		}

		finally
		{
			System.out.println("Finally Block Execeuted");
		}
	}
}