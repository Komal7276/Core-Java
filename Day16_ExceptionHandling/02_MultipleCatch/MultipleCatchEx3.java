class MultipleCatchEx3
{
	public static void main(String[] args) {
		
		try
		{
			int a = 100;
			int b = 10;

			int result = a / b;

			System.out.println("Result : "+ result);
			//This above line gives ArithmaticException (because of divide by 0)
		

			//This below code will never execute
			//Because exception already Occures above

			int arr[] = new int[5];
			arr[10] = 202; //ArrayIndexOutOfBoundsException not reached

		}

		//This catch Block Executes when ArithmaticException Occurs
		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide By Zero..");
		}

		//This catch block will not execute
		//Because Control already moved after first exception
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Array Index..");
		}

		//This catch block used if any other error occurs then to handle that it is used
		catch(Exception e)
		{
			System.out.println("Some other Error Occured");
		}

		System.out.println("Continue...");
	}
}