import java.util.Scanner;

class RemoveDuplicate
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter String : ");
		String str = sc.nextLine();

		String result = " "; //Start with empty string
	
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);

			if(result.indexOf(ch) == -1)
			{
				//If character is not already in result String
				result = result + ch;//Add character to result

			}
		}
	
		System.out.println("\nAfter Removing Duplicates : "+ result);

	}

}