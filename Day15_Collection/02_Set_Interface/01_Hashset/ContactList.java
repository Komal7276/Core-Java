import java.util.HashSet;
import java.util.Set;

class ContactList
{
    public static void main(String[] args) {
        
        Set<Long> contacts = new HashSet<>();

        contacts.add(7894527639L);
        contacts.add(8888477345L);
        contacts.add(9932174684L);
        contacts.add(7894527639L); // duplicate

        System.out.println("\nUnique Contact Numbers:");

        for(Long number : contacts)
        {
            System.out.println(number);
        }
    }
}