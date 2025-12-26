//Write a Java program to design a simple Restaurant Menu Ordering System using the switch statement.

import java.util.Scanner;

class RestoMenuOrderingSystem 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("");

		System.out.println("*-*-----  Welcome to Hotel Gandhrava  -----*-* : ");
		System.out.println("");

		System.out.print("Enter what you want to eat : ");
		String menu = sc.nextLine();

		System.out.println("");

		switch(menu)
		{
			case "starter" :
				System.out.println("1.Masala Papad		:		Rs/- 45"); 
				System.out.println("2.Manchurian		:		Rs/- 210"); 
				System.out.println("3.Veg-Lolipop		: 		Rs/- 220"); 
			break;

			case "roti":
				System.out.println("1.Tandoori Roti 		: 	Rs/- 15");
				System.out.println("2.Butter Naan 			: 	Rs/- 30");
				System.out.println("3.Butter Garlic Cheese Naan 	:	Rs/- 45");
			break;

			case "rice":
				System.out.println("1.Masala Rice 		: 	Rs/- 100");
				System.out.println("2.Plain Rice 		: 	Rs/- 70");
				System.out.println("3.Jeera Rice 		: 	Rs/- 80");
			break;	

			case "sabji" :
				System.out.println("1.Kaju Masala 		: 	Rs/- 320");
				System.out.println("2.Paneer Tikka 		:	Rs/- 330");
				System.out.println("3.Veg Kofta 		: 	Rs/- 350");	
				System.out.println("4.Malai Kofta 		:	Rs/- 380");
				System.out.println("5.Mix Veg 			: 	Rs/- 300");		
			break;

			case "icecream" :
				System.out.println("1.Vanilla 			:	Rs/- 60");
				System.out.println("2.Butter Scotch 	:	Rs/- 60");
				System.out.println("3.Chocolate 		:	Rs/- 60");
				System.out.println("4.Strawberry 		:	Rs/- 60");
				System.out.println("5.Pan 			:	Rs/- 60");
			break;

			default :
				System.out.println("Sorry !! This is not Available in Our Hotel");

		}

		sc.close();
	}
}