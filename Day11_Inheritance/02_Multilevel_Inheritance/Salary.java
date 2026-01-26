//Created multilevel inheritance program to show company, employee and salary details.

import java.util.Scanner;

class Company
{
	String companyName;

	void setCompany(String name)
	{
		companyName = name;
	}
}


class Employee extends Company
{
	int empId;

	void setEmployee(int id)
	{
		empId = id;
	}
}

class Salary extends Employee
{
	double salary;

	void setSalary(double sal)
	{
		salary = sal;
	}

	void display()
	{
		System.out.println("\nCompany : "+ companyName);
		System.out.println("Employee ID : "+ empId);
		System.out.println("Salary : "+ salary);
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Salary s1 = new Salary();

		System.out.print("\nEnter Name : ");
		String eName = sc.nextLine();

		System.out.print("Enter Employee ID : ");
		int empId = sc.nextInt();

		System.out.print("Enter Salary : ");
		double Salary = sc.nextDouble();

		s1.setCompany("TCS");
		s1.setEmployee(101);
		s1.setSalary(25000);
		s1.display();
	}
}
