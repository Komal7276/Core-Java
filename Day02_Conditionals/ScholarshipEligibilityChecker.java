//Create Java program to determine scholarship eligibility 
//using marks and family income criteria

import java.util.Scanner;

class ScholarshipEligibilityChecker
{
    public static void main(String [] args)
    {
        Scanner s1 = new Scanner(System.in);

        System.out.println("");

        System.out.print("Enter Marks : ");
        int marks = s1.nextInt();

        System.out.print("Enter Family Income : ");
        double income = s1.nextDouble();

        System.out.println("");

        if(marks >= 75 && income <= 200000)
        {
            System.out.println("Eligible for Scholarship");
        }
        else
        {
            System.out.println("Not Eligible for Scholarship");
        }
    }
}