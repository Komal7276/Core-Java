class EmployeeEncap
{
	private int empId;
	private String empName;
	private double empSalary;

	public void setEmpId(int id)
	{
		empId = id;
	}

	public int getEmpId()
	{
		return empId;
	}

	public void setEmpName(String name)
	{
		empName = name;
	}

	public String getEmpName()
	{
		return empName;
	}

	public void setEmpSalary(double salary)
	{
		empSalary = salary;
	}

	public double getEmpSalary()
	{
		return empSalary;
	}



	public static void main(String[] args) {
		
		EmployeeEncap e1= new EmployeeEncap();

		e1.setEmpId(101);
		e1.setEmpName("Komal");
		e1.setEmpSalary(1200000);
	

		System.out.println("\nId : "+ e1.getEmpId());
		System.out.println("Name : "+ e1.getEmpName());
		System.out.println("Salary : "+ e1.getEmpSalary());

	}
}