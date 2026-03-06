class NullPointerExceptionEx
{
	public static void main(String[] args) {
			
		/*
		String name =null;

		String result = name.toUpperCase();

		System.out.println(result); //it gives NullPointerException -->to resolve this we use try-catch block
		
		*/

		try 
		{
			String name = null;
			String result = name.toUpperCase();

			System.out.println(result); //It gives exception
		}

		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception Occured : String is Null");
		}

	}
}