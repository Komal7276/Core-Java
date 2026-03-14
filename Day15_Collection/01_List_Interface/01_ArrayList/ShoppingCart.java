import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
	public static void main(String[] args) {
		
		List<String> cart = new ArrayList<>();

		cart.add("Laptop");
		cart.add("Mouse");
		cart.add("Keyboard");
		cart.add("Mouse");  //Duplcate item

		System.out.println("Items in cart: " + cart);

		System.out.println("First Cart : " + cart.get(0));

		cart.remove("Keyboard");

		System.out.println("Final Cart: " + cart);
		System.out.println("Total Items: " + cart.size());

	}
}