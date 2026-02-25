class NullPointerEx1
{
	public static void main(String[] args) {
		
		/*String names[] = {"Sakshi", null, "Aditi", "Komal", "Shraddha", "Prachi"};

			for(int i = 0; i < names.length; i++)
			{
				System.out.println(names[i].length()); //i =1 it gives nullpointerException
			}
		*/

		String names[] = {"Komal","Pratiksha",null,"Mohini","Aarti","Radhika"};

		for(int i=0; i<names.length; i++)
		{
			try
			{
				System.out.println(names[i].length());
			}
			catch(NullPointerException e)
			{
				System.out.println("One name is null");
			}
		}

		System.out.println("Program Continues....");
	}
}