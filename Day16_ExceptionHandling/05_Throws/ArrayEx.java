import java.util.Scanner;

class ArrayEx
{
	static int getValue(int arr[], int index) throws ArrayIndexOutOfBoundsException
	{
		return arr[index];
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.println("\nEnter 5 Array Elements : ");

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.print("\nEnter index to get element : ");
		int index = sc.nextInt();

		int value = getValue(arr, index);

		System.out.println("\nElement : "+ value);
	}
}