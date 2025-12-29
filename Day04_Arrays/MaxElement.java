//Write a Java program to fins largest element in an array

class MaxElement
{
	public static void main(String[] args) {
		
		int arr[] = {13,51,7,99,50};

		int max= arr[0];

		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max= arr[i];
			}
		}

		System.out.println("Maximum Element : " +max);

	}
}