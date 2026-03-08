import java.util.Scanner;

class SortStringCharacters
{
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter String : ");
		String str = sc.nextLine();

		char ch[] = str.toCharArray();
						//toCharArray() => this is method of String class 
										// that convert string into character array by separating each character of String

		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i] > ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}


		System.out.println("\nSorted String : ");

		for(int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}

	}
}