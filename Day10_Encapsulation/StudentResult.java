import java.util.Scanner;

class StudentResult
{
	private int rollNo;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;

	public void setRollNo(int rollno)
	{
		this.rollNo = rollno;
	}

	public void setName(String name)
	{
		this.name = name; 
	}

	public void setMarks1(int m1)
	{
		if(m1 >= 0 && m1 <= 100)
		{
			marks1 = m1;
		}
		else
		{
			System.out.println("\nInvalid Marks for Subject 1");
		}
	}

	public void setMarks2(int m2)
	{
		if(m2 >= 0 && m2 <= 100)
		{
			marks2 = m2;
		}
		else
		{
			System.out.println("\nInvalid Marks for Subject 2");
		}
	}

	public void setMarks3(int m3)
	{
		if(m3 >= 0 && m3 <= 100)
		{
			marks3 = m3;
		}
		else
		{
			System.out.println("\nInvalid Marks for Subject 3");
		}
	}


	public int getTotal()
	{
		return marks1 + marks2 + marks3;
	}

	public double getPercentage()
	{
		return getTotal() / 3.0;
	}

	public void display()
	{
		System.out.println("\n-----Student Result -----");
		System.out.println("Roll No : "+ rollNo);
		System.out.println("Name :"+ name);
		System.out.println("Total Marks :"+ getTotal());
		System.out.println("Percentage : "+ getPercentage());
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		StudentResult s = new StudentResult();

		System.out.print("\nEnter Roll Number : ");
		s.setRollNo(sc.nextInt());

		sc.nextLine(); 	//buffer clear

		System.out.print("Enter Name : ");
		s.setName(sc.nextLine());

		System.out.print("Enter Marks of Subject 1 :");
		s.setMarks1 (sc.nextInt());

		System.out.print("Enter Marks of Subject 2 :");
		s.setMarks2 (sc.nextInt());

		System.out.print("Enter Marks of Subject 3 :");
		s.setMarks3 (sc.nextInt());


		s.display();
	}
}