class NumberFormatExceptionEx
{
	public static void main(String[] args) {
		
		/*
		String age = " twenty";

		int num = Integer.valueOf(age);

		System.out.println("Age is: " + num); //NumberFormatException
		*/

		try
		{
			String age = "twenty";
			int num = Integer.valueOf(age);

			System.out.println("Age is : "+num);
		}

		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception Occured : cannot convert String to Number");
		}
	}
}