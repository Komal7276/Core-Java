class ThrowEx1
{
	public static void main(String[] args) {
		
		int age = -20;

		//Check if age is negative
		if(age < 0)
		{
			//Manually throwing an exception using 'throw' keyword
			//This will stop the program execution immediately
			throw new ArithmeticException("Age cannot be Negative");
		}

		System.out.println("Valid age");
	}
}