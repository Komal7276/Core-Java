class ThrowEx3
{
	public static void main(String[] args) {
		
		int balance = 10000;
		int withdrawAmt = 11000;

		try
		{
			if(withdrawAmt > balance)
			{
				throw new ArithmeticException("Insufficient Balance");
			}

			balance = balance - withdrawAmt;
			System.out.println(withdrawAmt +" Withdrawal Successfully");
		}

		catch(ArithmeticException e)
		{
			System.out.println("Exception : "+ e.getMessage());
		}

		System.out.println("Program Continues...");
	}
}