import java.util.LinkedList;

class LinkedListCode
{
    public static void main(String[] args) {

        // Create a LinkedList of String type
        LinkedList<String> list = new LinkedList<>();

        System.out.println("List of my friends");

        // add(element) → adds element at the end of list
        list.add("Pratiksha");
        list.add("Mohini");
        list.add("Prachi");
        list.add("Aditi");
        list.add("Shraddha");

        // Prints all elements of LinkedList
        System.out.println(list);

        // Create another LinkedList for subjects
        LinkedList<String> list1 = new LinkedList<>();

        // add(element) → adds subject names
        list1.add("Math");
        list1.add("English");
        list1.add("Science");
        list1.add("Sanskrit");
        list1.add("Marathi");

        System.out.println("\nList of Subject:");
        System.out.println(list1);

        // addFirst(element) → adds element at beginning
        list.addFirst("Sakshi");

        // addLast(element) → adds element at end
        list.addLast("Priyanka");

        // remove(Object) → removes specified element
        list.remove("Shraddha");
        list.remove("Priyanka");

        System.out.println("\nAfter LinkedList operations on Friends");
        System.out.println(list);
    }
}