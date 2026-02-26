class MultipleCatchEx2
{
	public static void main(String[] args) {
		
		try
		{
			int ino1 = 50;
			int ino2 = 5;

			//int ino2 = 0; //Occurs ArithmaticException

			int ans = ino1 / ino2;

			System.out.println("Result : "+ ans);

			String str = null;
			System.out.println(str.length()); //NullPointerException
		}

		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide By Zero...");
		}

		catch(NullPointerException e)
		{
			System.out.println("Null Value");
		}


		//This ia a general catch block
		//It handles any exception that is not caught by above specific catch blocks
		//Since Exception is the parent class of most exceptions
		//It acts as a backup handler for unexpected errors

		catch(Exception e)
		{
			System.out.println("Some Other Error Occured");
		}

		System.out.println("Program Continues..");
	}
}