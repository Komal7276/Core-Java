import java.util.Scanner;

class MatrixAddition
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[2][2];
		int b[][] = new int[2][2];

		int sum[][] = new int[2][2];

		System.out.println("\nEnter First Matrix : ");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}	

		System.out.println("\nEnter Second Matrix : ");

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("\nMatrix Addition Result : \t");

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print("\t"+ sum[i][j] + "\t");
			}

			System.out.println();
		}
	}
}