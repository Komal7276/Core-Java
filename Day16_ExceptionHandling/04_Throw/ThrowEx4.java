class ThrowEx4
{
	public static void main(String[] args) {
		
		String password = "12345";

		if(password.length() < 8)
		{
			//RuntimeException is used because password is invalid
			throw new RuntimeException("Password too Short");
		}

		System.out.println("Valid Password ");
	}
}



/*  It checks whether the password length is less than 8 characters.
	If the condition is true, a RuntimeException is manually thrown
	with the message "Password too short".
	When the exception is thrown, program execution stops immediately.
	The "Valid Password" message will print only if the password length is 8 or more.
	*/