//Create a Java program to check password strength using conditional statements.

import java.util.Scanner;

class PasswordStrengthChecker
{
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);

		System.out.println("");

		System.out.print("Enter Password :  ");
		String password = s1.nextLine();

		System.out.println("");
			
		if(password.length() >= 8 && 
			password.matches(".*[A-Z]*.") && 
			password.matches(".*[0-9]*.")){
			System.out.println("Strong Password");
		}
		else{
			System.out.println("Weak Password");
		}
	}
}