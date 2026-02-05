import java.util.LinkedList;

class HospitalManagement
{
	  public static void main(String[] args) {

        LinkedList<String> patients = new LinkedList<>();
        LinkedList<String> emergencypatients = new LinkedList<>();

        // Patients arrive
        patients.add("Patient A");
        patients.add("Patient B");
        patients.add("Patient C");

        System.out.println("Patient List:");
        System.out.println(patients);

        emergencypatients.add("Patient 1");
        emergencypatients.add("Patient 2");
        emergencypatients.add("Patient 3");
        // Emergency patient (added at front)
        patients.addFirst("Emergency Patient");
        System.out.println("\nAfter Emergency Arrival:");
        System.out.println(emergencypatients);

        // Serve patient First Come First Out
        String served = patients.removeFirst();
        System.out.println("\nServed: " + served);

        // Current patient
        System.out.println("Current Patient: " + patients.getFirst());

        System.out.println("\nRemaining Patients:");
        System.out.println(patients);
    }

} 