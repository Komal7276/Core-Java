class ArithmaticExceptionEx
{

	public static void main(String[] args) {
			
			/*
		int ino1 = 100;
		int ino2 = 0;

		int ians = ino1 / 0;

		System.out.println("Divide :" +ians);*/ 
		 //it code give ArithmaticException

		//to resolve this ArithmaticException we use try-catch
	

		try
		{
			int ino1 = 100;
			int ino2 = 0;

			int ians = ino1 / ino2;

			System.out.println("Divide : "+ ians);
		} 

		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception Occured : Division by Zero");
		}


	}	
}