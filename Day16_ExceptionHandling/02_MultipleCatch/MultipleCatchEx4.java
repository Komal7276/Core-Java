class MultipleCatchEx4
{
	public static void main(String[] args) {
		
		try
		{
			int ino1 = 500;
			int ino2 = 25;

			int result = ino1 / ino2; //ArithmaticException
			System.out.println("Result : "+ result);

			String str = null;
			System.out.println(str.length()); //NullPointerException
		}

		//Multiple Exceptions handles in one catch block
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println("Arithmatic or Null Error Occured");
		}

		catch(Exception e)
		{
			System.out.println("Some Other Exception Occured");
		}

		System.out.println("Continue");
	}
}