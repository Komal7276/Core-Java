// Custom Exception class
// This class is created by the user to represent a specific error
class AgeException extends Exception
{
	AgeException(String msg)
	{
		// Calls the constructor of the parent Exception class
        // and stores the message
		super(msg);
	}
}


class AgeCheck
{

    // 'throws AgeException' tells Java that this method may throw this exception
	static void checkAge(int age ) throws AgeException
	{
		 // If age is less than 18, throw custom exception
		if(age < 18)
		{
			throw new AgeException("\nNot eligible");
		}

		System.out.println("\nEligible");
	}

	public static void main(String[] args) {
		
		try
		{
			  // This will trigger the exception
			checkAge(66);
		}


        // Catch block to handle the custom exception
		catch(AgeException e)
		{
			System.out.println(e.getMessage());
		}

	}
}