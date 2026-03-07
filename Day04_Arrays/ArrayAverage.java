import java.util.Scanner;

class ArrayAverage
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter number of elements : ");
		int n= sc.nextInt();

		int arr[] = new int[n];
		int sum = 0 ;

		System.out.println("\nEnter Arrya Elements : ");

		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}

		double avg = (double) sum / n;

		System.out.println("\nAverage of Array Elements : "+ avg);
	}
}