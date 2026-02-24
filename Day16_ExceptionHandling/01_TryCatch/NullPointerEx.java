class NullPointerEx
{
	public static void main(String[] args) {
		
		/**
		 * String name1 = null;
		 * System.out.println(name1.length()); //NullPointerException
		 * */

		 try
		 {
		 	String name = null;
		 	System.out.println(name.length());
		 }

		 catch(NullPointerException e)
		 {
		 	System.out.println("Error : String is Null");
		 }

		 System.out.println("Program Continues...");
	}
}