import java.util.Scanner;

class Person
{
	String name;
	int age;

	void setPerson(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}


class Teacher extends Person
{
	String subject;
	double salary;
	double increment;
	char grade;

	void setTeacher(String subject, double salary)
	{
		this.subject = subject;
		this.salary = salary;
	}

	void calculateGrade(int rating)
	{
		if(rating >= 9)
		{
			grade ='A';
		}
		else if(rating >=7)
		{
			grade ='B';
		}
		else if(rating >=4)
		{
			grade = 'C';
		}
		else
		{
			grade = 'D';
		}
	}


	void applyIncrement()
	{
		if(grade == 'A')
		{
			increment = salary * 0.20;
			salary = salary + increment;
		}
		else if(grade == 'B')
		{
			increment = salary * 0.10;
			salary = salary + increment;
		}
		else if(grade == 'C')
		{
			increment = salary * 0.05;
			salary = salary + increment;
		}
	}


	void display()
	{
		System.out.println("\n-------Teacher Details-------");
		System.out.println("\n Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("Subject : "+ subject);
		System.out.println("Grade : "+ grade);
		System.out.println("Final Salary : "+ salary);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Teacher t1 = new Teacher();

		System.out.print("\nEnter Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Age : ");
		int age = sc.nextInt();

		sc.nextLine(); 	//Consume newline

		System.out.print("Enter Subject : ");
		String subject = sc.nextLine();

		System.out.print("Enter Base Salary : ");
		double salary = sc.nextDouble();

		System.out.print("Enter Performance Rating (0-10) : ");
		int rating = sc.nextInt();


		t1.setPerson(name, age);
		t1.setTeacher(subject, salary);
		t1.calculateGrade(rating);
		t1.applyIncrement();
		t1.display();
	}
}