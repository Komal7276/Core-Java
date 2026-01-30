import java.util.Scanner;

//Interface defining authentication rules
interface AuthService
{
	boolean authenticate(String username, String password);

default void showAuthMessage()
	{
		System.out.println("\nAuthenticaton Process Started...\n");
	}

	static void authInfo()
	{
		System.out.println("AutService v1.0 - Secure Login System\n");
	}

}


//Username & Password based authentication
class PasswordAuth implements AuthService
{
	public boolean authenticate(String username,String password)
	{
		return username.equals("admin") && password.equals("admin123");
	}
}


//OTP based authentication
class OTPAuth implements AuthService
{
	public boolean authenticate(String username, String password)
	{
		return password.equals("123456");
	}
}


//Main class with user choice
public class AuthenticationSystem
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AuthService auth = null;

		AuthService.authInfo();

		System.out.println("\nChoose Authentication Method ");
		System.out.println("1. Username & Password");
		System.out.println("2. OTP Authentication");

		System.out.print("\nEnter Choice : ");
		int choice = sc.nextInt();

		sc.nextLine();

		System.out.print("\nEnter UserName : ");
		String username = sc.nextLine();

		System.out.print("Enter Password / OTP :");
		String password = sc.nextLine();


		if(choice == 1)
		{
			auth = new PasswordAuth();
		}

		else if(choice == 2)
		{
			auth = new OTPAuth();
		}

		else
		{
			System.out.println("\nInvalid Choice");
		}


		auth.showAuthMessage();



		if(auth.authenticate(username, password))
		{
			System.out.println("\nAuthentication Successful!!");
		}
		else
		{
			System.out.println("\nAuthentication Failed");
		}

	}
}