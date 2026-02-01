import java.util.Scanner;

interface Attendence
{
	boolean mark();
}

interface Salary
{
	double calculateSalary(int days);
}

interface Performance
{
	String review();
}


class EmployeeSystem implements Attendence,Salary,Performance
{
	public boolean mark()
	{
		return true;
	}

	public double calculateSalary(int days)
	{
		return days * 1500;
	}

	public String review()
	{
		return "Excellent";
	}
}


class Employee
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		EmployeeSystem emp = new EmployeeSystem();

		System.out.print("\nEnter Working Days : ");
		int days = sc.nextInt();

		if(emp.mark())
		{
			System.out.println("\nSalary : "+ emp.calculateSalary(days));
			System.out.println("Performance : "+ emp.review());
		}
	}
}