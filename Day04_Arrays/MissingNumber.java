import java.util.Scanner;

class MissingNumber
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Size of Array (n-1) : ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("\nEnter Array Element from 1 to n with One Missing : ");

		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}	

		int expectedSum = (n+1) * (n+2) / 2;
		int actualSum = 0;

		for(int i=0; i<n; i++)
		{
			actualSum += arr[i];
		}

		int missing = expectedSum - actualSum;

		System.out.println("\nMissing Number : "+ missing);
	}
}