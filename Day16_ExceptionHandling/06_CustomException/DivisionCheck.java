class DivisionException extends Exception
{
	DivisionException(String msg)
	{
		super(msg);
	}
}


class DivisionCheck
{
	static void divide(int a, int b) throws DivisionException
	{
		if(b == 0)
		{
			throw new DivisionException("Cannot Divide By Zero");
		}

		int result = a / b;
		System.out.println("result: " + result);
	}

	public static void main(String[] args) {
		
		try
		{
			divide(10, 0);
		}

		catch(DivisionException e)
		{
			System.out.println(e.getMessage());
		}
	}
}