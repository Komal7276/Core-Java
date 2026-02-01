import java.util.Scanner;

interface Appointment
{
	void bookAppointment(String doctor);
}

interface BillingService
{
	double generateBill();
}

interface NotificationService
{
	void notifyPetient();
}


class HospitalSystem implements Appointment,BillingService,NotificationService
{
	public void bookAppointment(String doctor)
	{
		System.out.println("\nAppointment booked with Dr."+ doctor);
	}

	public double generateBill()
	{
		return 700;
	}

	public void notifyPetient()
	{
		System.out.println("\nPatient Notified Successfully");
	}
}





public class Hospital
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HospitalSystem system = new HospitalSystem();

		System.out.print("\nEnter Doctor Name : ");
		String doctor = sc.nextLine();

		system.bookAppointment(doctor);

		System.out.println("\nBill Amount : "+ system.generateBill());

		system.notifyPetient();
	}
}