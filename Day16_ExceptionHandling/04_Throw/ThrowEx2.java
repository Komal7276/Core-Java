class ThrowEx2
{
	public static void main(String[] args) {
		
		int marks = 188;

		//Check if marks are outside valid range(0 -100)
		if(marks > 100 || marks < 0)
		{
			// Manually throwing exception using 'throw'
			// IllegalArgumentException is used because the value is invalid
			throw new IllegalArgumentException("Invalid Marks");
		}

		//This line executes only if marks are valid
		System.out.println("Makrs are Valid");
	}
}