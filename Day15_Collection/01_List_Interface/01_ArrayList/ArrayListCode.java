import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayListCode {
    public static void main(String[] args) {

        List<String> courses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // number of courses
        System.out.print("\nEnter number of courses: ");
        int n = sc.nextInt();
        
        sc.nextLine();

        System.out.print("Enter course name: ");

        // add courses
        for (int i = 0; i < n; i++) {
            
            courses.add(sc.nextLine());
        }

        // insert DSA at index 1
        courses.add(1, "DSA");

        // print list
        System.out.println("\nCourses: " + courses);

        // get element
        System.out.println("Course at index 2: " + courses.get(2));

        // update first element
        courses.set(0, "Core C");

        // check element
        System.out.println("\n Contains Java:  " + courses.contains("Java"));

        // remove Python
        courses.remove("Python");

        // final list
        System.out.println("\n Final List: " + courses);

        sc.close();
    }
}