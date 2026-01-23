class Employee 		//class
{
	int empId;
	String empName;
	double empSalary;


	void show() 	//Method
	{
		System.out.print("\nEmployee ID : "+ empId);
		System.out.print("\nEmployee Name : "+ empName);
		System.out.print("\nSalary : "+ empSalary);
	}


	public static void main(String args[])
	{
		Employee e1 = new Employee(); 	//Object Creation

		e1.empId = 101;
		e1.empName = "Komal";
		e1.empSalary = 900000;

		e1.show(); 	//Method call by using reference object
	}

}