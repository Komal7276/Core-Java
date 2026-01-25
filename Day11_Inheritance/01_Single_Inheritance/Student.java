
class Person
{
	String name;
	int age;

	void setPersonDetails(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}

class Student extends Person
{

	int marks1,marks2,marks3;

	void setMarks(int m1,int m2,int m3)
	{
		marks1=m1;
		marks2=m2;
		marks3=m3;
	}

	int getTotal()
	{
		return marks1+marks2+marks3;
	}

	double getPercentage()
	{
		return getTotal()/3.0;
	}


	void display()
	{
		System.out.print("\nName : "+name);
		System.out.print("\nAge : "+age);
		System.out.print("\nTotal Marks : "+getTotal());
		System.out.print("\nPercentage : "+getPercentage());
	}


	public static void main(String[] args) {
		
		Student s1 = new Student();

		s1.setPersonDetails("Komal",21);
		s1.setMarks(88,96,87);
		s1.display();
	}
}