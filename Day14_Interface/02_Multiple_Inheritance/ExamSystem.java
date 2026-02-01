import java.util.Scanner;


interface Evaluation
{
	int calculateMarks(int marks, int attempts);
}

interface Result
{
	String getResult(int finalMarks);
}

interface Certificate
{
	void generateCertificate(String grade);
}


class ExamResult implements Evaluation,Result,Certificate
{

	@Override
	public int calculateMarks(int marks, int attempts)
	{
		if(marks < 0 || marks > 100)
		{
			return -1; 	//Invalid marks indicator
		}

		// Grace only for first attempt & near pass
		else if(marks >= 35 & marks < 40 && attempts == 1)
		{
			return 40;
		}

		if(attempts > 2)
		{
			return marks - 5;
		}

		return marks;
	}


	public String getResult(int finalMarks)
	{
		if(finalMarks >= 75)
		{
			return "Distinction";
		}

		else if(finalMarks >= 60)
		{
			return "First Class";
		}

		else if(finalMarks >= 40)
		{
			return "Pass";
		}

		else
		{
			return "Fail";
		}
	}


	@Override
	public void generateCertificate(String grade)
	{
		System.out.println("\nCertificate Generated for Grade : "+grade);
	}
}




class ExamSystem
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ExamResult exam = new ExamResult();

		System.out.println("\nEnter Marks between 1 to 100\n");
		System.out.print("Enter Marks : ");
		int marks = sc.nextInt();

		System.out.print("Enter Attempt Number : ");
		int attempts = sc.nextInt();

		int finalMarks = exam.calculateMarks(marks, attempts);

		if(finalMarks == -1)
		{
			System.out.println("\nError : Invalid Marks Entered");
			return; 	//Stop System
		}

		System.out.println("\nFinal Marks : "+finalMarks);

		String result = exam.getResult(finalMarks);
		System.out.println("\nResult : "+result);

		if(!result.equals("Fail"))
		{
			exam.generateCertificate(result);
		}

	}
}