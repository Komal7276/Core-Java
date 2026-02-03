import java.util.ArrayList;
import java.util.List;

class ArrayListBasic
{
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		

		System.out.println(numbers);

		numbers.remove(1); //remove index 1 -->20
		System.out.println("\nAfter remove index 1: "+ numbers);
		
		numbers.add(40);
		numbers.add(50);

		System.out.println("\nAfter adding index 3 and 4: "+numbers);

		numbers.add(2,20);
		System.out.println("\nAdded all list with 2nd index:"+numbers);
	}
}