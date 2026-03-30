/*
	5 4 3 2 1
	4 3 2 1
	3 2 1
*/

class Pattern11
{
	public static void main(String[] args) {
		
		for(int i=5; i>=3; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}