import java.util.Scanner;

interface MemberCheck
{
	boolean isValidMember(int memberId);
}

interface BookLimit
{
	boolean canIssueBook(int issuedBooks);
}

interface FeeCalculation
{
	int calculateLateFee(int daysLate);
}

interface Message
{
	void showMessage(String msg);
}


class LibrarySystem implements MemberCheck,BookLimit,FeeCalculation,Message
{
	public boolean isValidMember(int memberId)
	{
		return memberId > 1000;
	}

	public boolean canIssueBook(int issuedBooks)
	{
		return issuedBooks < 3;
	}

	public int calculateLateFee(int daysLate)
	{
		return daysLate * 5;
	}

	public void showMessage(String msg)
	{
		System.out.println(msg);
	}
}




public class Library
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		LibrarySystem libsystem = new LibrarySystem();


		System.out.print("\nEnter Member ID (>= 1000) : ");
		int memberId = sc.nextInt();

		System.out.print("Boooks already issued (<=4) : ");
		int issuedBooks = sc.nextInt();

		System.out.print("Days late (0 if none) : ");
		int daysLate = sc.nextInt();


		if(!libsystem.isValidMember(memberId))
		{
			libsystem.showMessage("Invalid Member ID!");
			return;
		}

		if(!libsystem.canIssueBook(issuedBooks))
		{
			libsystem.showMessage("\nBook issue limit reached!");
			return;
		}


		int fee = libsystem.calculateLateFee(daysLate);

		libsystem.showMessage("\nBook Issued Successfully..!!");
		System.out.println("Late Fee : " + fee);
	}
}