class RemoveDuplicate
{
	public static void main(String[] args) {
		 
		int arr[] = {1,2,3,4,5,4,6,7,8,9,1};

		System.out.println("\nArray without Duplicates : ");

		for(int i=0; i<arr.length; i++)
		{
			boolean isDuplicate = false;

			for(int j=0; j<i; j++)
			{
				if(arr[i] == arr[j])
				{
					isDuplicate = true;
					break;
				}
			}

			if(!isDuplicate)
			{
				System.out.println(arr[i] + " ");
			}
		}
	}
}