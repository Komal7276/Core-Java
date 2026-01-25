import java.util.Scanner;

class Employee
{
	int empId;
	String empName;
	double basicSalary;

	void setEmployee(int id, String name, double salary)
	{
		empId = id;
		empName = name;
		basicSalary = salary;
	}
}


class EmployeeSalary extends Employee
{
	double hra;
	double da;
	double netSalary;

	void calculateSalary()
	{
		hra = basicSalary * 0.20; 	//20%HRA
		da = basicSalary * 0.10; 	//10%DA
		netSalary = basicSalary + hra + da;
	}

	void display()
	{
		System.out.println("\n----------Salary Details----------");
		System.out.println("\nEmployee ID : "+ empId);
		System.out.println("Employee Name : "+ empName);
		System.out.println("Basic Salary : "+ basicSalary);
		System.out.println("HRA : "+ hra);
		System.out.println("DA : "+ da);
		System.out.println("Net Salary : "+ netSalary);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmployeeSalary e1 = new EmployeeSalary();

		System.out.print("\nEnter Employee ID : ");
		int id = sc.nextInt();

		sc.nextLine(); 	//Consume newline

		System.out.print("Enter Employee Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Basic Salary : ");
		double salary = sc.nextDouble();

		e1.setEmployee(id,name,salary);
		e1.calculateSalary();
		e1.display();
	}
}