class NumberFormatEx1
{
	public static void main(String[] args) {
		
		String data[] = {"100","4","twenty","30","6k"};

		int sum = 0;

		for(int i=0; i<data.length; i++)
		{
			try
			{
				int num = Integer.parseInt(data[i]);

				sum +=num;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid number found : "+ data[i]);
			}
		}

		System.out.println("Total Sum : "+ sum);
	}
}