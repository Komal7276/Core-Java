//Create ATM withdrawal system with balance validation and denomination check

import java.util.Scanner;

class ATMWithdrawalSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double balance = 100000;

        System.out.println("");

        System.out.print("Enter Withdrawal Amount : ");
        double amount = sc.nextDouble();

        System.out.println("");

        if(amount > 0){
            if(amount <= balance){
                if(amount % 100 == 0){
                    balance -= amount;

                    System.out.println("Withdrawal Successful");
                    System.out.println("Remaining Balance : " + balance);
                }
                else{
                    System.out.println("Amount must be multiple of 100");
                }}
            else{
                System.out.println("Insufficient balance");
            }}

        else{   
            System.out.println("Invalid Withdrawal Amount");
        }}

            
        
}
