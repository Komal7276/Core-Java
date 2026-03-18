import java.util.Scanner;

class PasswordException extends Exception 
{
    PasswordException(String msg) 
    {
        super(msg);
    }
}


class PasswordValidation
{
	static void checkPassword(String password) throws PasswordException
	{
		if(password.length() < 8 ||
		  !password.matches(".*[A-Z].*")||   //.*accept anything before or after
		  !password.matches(".*[a-z].*")||
		  !password.matches(".*[0-9].*") ||
		  !password.matches(".*[^a-zA-Z0-9].*"))
		{
			throw new PasswordException("\nInvalid password");
		}

		System.out.println("\nPassword is valid");
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter password: ");
        String password = sc.nextLine();

        try 
        {
            checkPassword(password);
        } 
        
        catch (PasswordException e) 
        {
            System.out.println(e.getMessage());
        }

	}
}