import java.util.Scanner;

//Interface for Validation rules
interface Validator
{
	boolean validate(String input);
}

//Email validation rule
class EmailValidator implements Validator
{
	public boolean validate(String input)
	{
		return input.contains("@") && input.contains(".");
	}
}

//Password validation rule
class PasswordValidator implements Validator
{
	public boolean validate(String input)
	{
		return input.length() >= 8;
	}
}

//Age validation rule
class AgeValidator implements Validator
{
	public boolean validate(String input)
	{
		int age = Integer.parseInt(input);
		return age >= 18;
	}
}


//Main Validation System
public class ValidationSystem
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Validator validator = null;

		System.out.println("\nChoose Validation Type");
		System.out.println("1.Email Validation");
		System.out.println("2.Password Validation");
		System.out.println("3.Age Validation");

		System.out.print("\nEnter Choice : ");
		int choice = sc.nextInt();

		sc.nextLine(); 	//Clear buffer

		System.out.print("\nEnter input to validate : ");
		String input = sc.nextLine();

		if(choice == 1)
		{
			validator = new EmailValidator();
		}
		else if(choice == 2)
		{
			validator = new PasswordValidator();
		}
		else if(choice == 3)
		{
			validator = new AgeValidator();
		}
		else
		{
			System.out.println("\nInvalid Choice");
			System.exit(0);
		}


		if(validator.validate(input))
		{
			System.out.println("\nValidation Successful");
		}
		else
		{
			System.out.println("\nValidation Failed");
		}

		sc.close();
	}
}