class MultipleCatchEx1
{
	public static void main(String[] args) {
		
		try
		{
			int a = 10;
			int b = 2;

			//If b=0 -> ArithmeticException will occur(divide by zero)
			//If b = 5 -> No exception will occur

			// Division operation
			// If b = 0 → exception happens here
			// If b = 2 → result = 5 and program continues normally

			int result = a / b;
			System.out.println("Result : "+ result);
		}


		//This block runs if any other exception occurs
		//It act as a general safety handler
		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide By Zero");
		}


		// This block runs if any other exception occurs
		// It acts as a general safety handler	
		catch(Exception e)
		{
			System.out.println("Some Other Error Occured");
		}


		// This line always executes
		// (whether exception happens or not, after catch handling)
		System.out.println("Program Continues...");

	}
}