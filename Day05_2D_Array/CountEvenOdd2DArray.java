class CountEvenOdd2DArray
{
	public static void main(String[] args) {
		int arr[][] ={
			{11,21,31},
			{42,54,66},
			{75,87,99}
		};

		int evenCount=0;
		int oddCount= 0;

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] % 2 == 0 )
				{
					evenCount++;
				}
				else
				{
					oddCount++;
				}
			}
		}


		System.out.println("Total Even Numbers : "+evenCount);
		System.out.println("Total Odd Numbers : "+oddCount);
	}
}