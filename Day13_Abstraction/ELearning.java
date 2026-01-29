import java.util.Scanner;

abstract class Course
{
	String courseName;
	double fees;

	abstract void enroll(String studentName);

	void showCourse()
	{
		System.out.println("\nCourse : "+ courseName + " | Fees : Rs/- " + fees);
	}
}

class OnlineCourse extends Course
{
	void enroll(String studentName)
	{
		System.out.println("\n"+studentName + " enrolled Successfully in "+ courseName);
	}
}

class ELearning
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		OnlineCourse oc = new OnlineCourse();

		System.out.print("\nEnter Course Name : ");
		oc.courseName = sc.nextLine();

		System.out.print("Enter Course Fees :");
		oc.fees = sc.nextDouble();

		sc.nextLine();

		System.out.print("Enter Student Name : ");
		String student = sc.nextLine();

		oc.enroll(student);
		oc.showCourse();
	}
}