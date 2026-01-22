//Write a Java program to compress a string by counting consecutive repeated characters.

import java.util.Scanner;

class StringCompression
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter String : ");
		String str = sc.nextLine();

		String result =" ";

		int count = 1;

		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
			{
				count++;
			}
			else
			{
				result = result + str.charAt(i)+count;
				count=1;
			}
		}


		result = result +str.charAt(str.length()-1) + count;

		System.out.println("\nCompressed String : " +result);
	}
}