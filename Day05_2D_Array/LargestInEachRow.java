class LargestInEachRow
{
	public static void main(String[] args) {
		
		int arr[][] = {
			{3, 7, 4},
			{1, 7, 9},
			{8, 3, 1}
		};

		for(int i=0; i<arr.length; i++)
		{
			int max = arr[i][0];

			for(int j=1; j<arr[i].length; j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
			}

			System.out.println("\nLargest in Row : "+ i + " : "+ max);
		}
	}
}