import java.util.Scanner;

//Parent Class
class Notification
{
	void send(String message)
	{
		System.out.println("\nSending Generic Message Notification : "+ message);
	}
}

//Child Class 1
class EmailNotification extends Notification
{
	@Override
	void send(String message)
	{
		System.out.println("\nSending Email Notification\n");
		System.out.println("Email Content : "+ message);
	}
}

class SMSNotification extends Notification
{
	@Override
	void send(String message)
	{
		System.out.println("\nSending SMS Notification\n");
		System.out.println("SMS Content : "+ message);
	}
}

//Main Class
public class NotificationApp
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Message : ");
		String msg = sc.nextLine();

		System.out.println("\nChoose Notification Type");
		System.out.println("1.Email");
		System.out.println("2.SMS");

		int choice = sc.nextInt();

		Notification n; 	//Parent Reference

		if(choice == 1)
		{
			n = new EmailNotification();
		}
		else
		{
			n = new SMSNotification();
		}

		System.out.println("\n------ Notification Status ------\n");
		n.send(msg); //Overriden Method Called
	}
}