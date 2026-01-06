import java.util.Scanner;

class StudentResultSystem
{
	static String getGrade(double percentage)
	{
		if(percentage >= 75)
		{
			return "Distinction";
		}

		else if(percentage >= 60)
		{
			return "First Class";
		}

		else if(percentage >= 50)
		{
			return "Second Class";
		}

		else if(percentage >= 35)
		{
			return "Pass";
		}

		else
		{
			return "Fail";
		}
	}


	static int calculateTotal(int marks[])
	{
		int total = 0;

		for(int i=0; i<marks.length; i++)
		{
			total = total + marks[i];
		}

		return total;
	}


	static double calculatePercentage(int total,int subjects)
	{
		double percentage = total/subjects;

		return percentage;
	}



	static void displayResult(String name, int total, double percentage, String grade)
	{
		System.out.println("\n----------Student Result----------");
		System.out.println("\nName : "+name);
		System.out.println("Total Marks : "+total);
		System.out.println("Percentage : "+percentage);
		System.out.println("Grade : "+grade);
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Student Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Number Of Subjects : ");
		int subjects =sc.nextInt();

		int marks[] = new int[subjects];

		System.out.println("\nEnter Marks : ");

		for(int i=0; i<subjects; i++)
		{
			marks[i] = sc.nextInt();
		}

		int total = calculateTotal(marks);

		double percentage = calculatePercentage(total,subjects);

		String grade = getGrade(percentage);

		displayResult(name,total,percentage,grade);


		sc.close();

	}
}