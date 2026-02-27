class FinallyExample4
{
	public static void main(String[] args) {
		
		int arr[] = new int[5];

		try
		{
			System.out.println("Accessing Array Elements...");
			System.out.println(arr[1]); //It's valid index, no exception
		}

		finally
		{
			//Mandatory code that must execute
			System.out.println("Finally Block Executed...");
		}
	}
}