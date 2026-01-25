class Employee
{
	int empId;
	String empName;
	double basicSalary;

	void setEmployee(int id, String name, double salary)
	{
		empId=id;
		empName=name;
		basicSalary=salary;
	}
}


class SalaryEmployee extends Employee
{
	double hra;
	double da;
	double netSalary;


	void calculateSalary()
	{
		hra = basicSalary * 0.20; 	//20% HRA
		da = basicSalary * 0.10; 	//10% DA
		netSalary = basicSalary + hra + da;
	}

	void display()
	{
		System.out.print("\nEmployee ID : "+ empId);
		System.out.print("\nEmployee Name : "+ empName);
		System.out.print("\nBasic Salary : "+ basicSalary);
		System.out.print("\nHRA : "+ hra);
		System.out.print("\nDA : "+ da);
		System.out.print("\nNet Salary : "+ netSalary);
	}


	public static void main(String[] args) {

		SalaryEmployee se = new SalaryEmployee();

		se.setEmployee(401,"Komal",55000);
		se.calculateSalary();
		se.display();
	}
}