import java.util.Scanner;

class PasswordCheckerStrings
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter a New Password : ");
		String pass = sc.next();

		if(pass.length() >= 8 && pass.contains("@"))
		{
			System.out.println("Strong Password!!");
		}
		else
		{
			System.out.println("Weak Password!! \n Use minimum 8 characters and '@' ");
		}
	}
}