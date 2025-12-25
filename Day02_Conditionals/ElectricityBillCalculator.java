//Create Java program to calculate electricity bill using else-if ladder

import java.util.Scanner;

class ElectricityBillCalculator
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);

        double bill = 0;
        
        System.out.println("");

        System.out.print("Enter Units Consumed : ");
        int units = s1.nextInt();

        if(units <= 100)
        {
            bill = units * 1.5;
        }

        else if(units <= 200)
        {
            bill = (100*1.5) + ((units-100) * 2.5);
        }
        else
        {
            bill = (100*1.5) + (100*2.5) + ((units-200) * 4.0);
        }

        System.out.println("");
        System.out.println("Total Electricity Bill : Rs/-" + bill);
    }
}