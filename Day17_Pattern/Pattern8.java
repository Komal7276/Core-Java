/*
A
B B
C C C
D D D D
E E E E E

*/

import java.util.Scanner;

public class Pattern8
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of rows : ");
        int rows = sc.nextInt();

        char ch = 'A';

        for(int i = 1; i <= rows; i++) 
        {
            for(int j = 1; j <= i; j++) 
            {
                System.out.print(ch + " ");
            }
            
            ch++;
            
            System.out.println();
        }

        
    }
}