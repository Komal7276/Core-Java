//Write a Java program to count Even and Odd numbers in an array

class EvenOddCount 
{
	public static void main(String[] args) {
		int arr[] = {87,231,82,74,2,100};
		int even = 0, odd = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
				even++;
			
			else 
				odd++;
		}

		System.out.println("Even Count = "+even);
		System.out.println("Odd Count : "+odd);

	}
}