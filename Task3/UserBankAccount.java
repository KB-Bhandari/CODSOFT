package Task3;

import java.util.Scanner;

public class UserBankAccount {
    
    Scanner scanner= new Scanner(System.in);
    public void withdraw(double balance) {
        System.out.println("Balance in your account : "+ balance);
        System.out.print("Enter withdrawal amount : ");
         
        double amount = scanner.nextInt();
        if(balance>amount)
        {
        System.out.println("You have withdrawed : "+ amount);
        balance= balance-amount;
        System.out.println("Remaining balance : "+ balance);
        }
        else{
            System.out.println("Insufficient Balance  ");
        }
        
        
    }
       
    public void deposit(double balance) {
        System.out.println("Balance in your account : "+ balance);
        System.out.print("Enter amount to deposit: ");
        
        double amount = scanner.nextInt();
        if(amount>0)
        {
        System.out.println("Deposited: "+ amount);
        balance+=amount;
        System.out.println("Balance : "+ balance);
        }
        else{
            System.out.println("Invalid trial for deposition ");
        }
        
    }

   
    public void checkBalance( double balance) {
        System.out.println("Balance in your account : "+ balance);
        
    }
    

 
    
}
