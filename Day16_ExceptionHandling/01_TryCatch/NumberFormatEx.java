class NumberFormatEx
{
	public static void main(String[] args) {
		
		/**
		 * int number1 = Integer.parseInt("Pooja");
		 * System.out.println(number1); //NumberFormatException
		 * */

		 try
		 {
		 	int number = Integer.parseInt("Komal");
		 	System.out.println(number);
		 }
		 catch(NumberFormatException e)
		 {
		 	System.out.println("Error : Invalid number format");
		 }

		 System.out.println("Program Continues...");

	}
}