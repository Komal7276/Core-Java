//Write a Program of  Basic String example and length method .gives string from users. 

import java.util.Scanner;

class StringBasic
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter String");
		String name=sc.nextLine();

		System.out.println("Name: "+name);

		System.out.println("Length: "+name.length());
	}
}