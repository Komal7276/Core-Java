import java.util.Scanner;

class ReverseArray
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter how many elements you wnat in array list : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("\nEnter array elements : ");

		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("\nReversed Array : ");

		for(int i=size-1; i >= 0; i--)
		{
			System.out.println(arr[i]+ " ");
		}
	}
}




/*
class ReverseArray 
{
	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 30, 40, 50};

		System.out.println("Reversed Array: ");

		for(int i = arr.length - 1; i >= 0; i -- )
		{
			System.out.println(arr[i]);
		}
	}
}*/