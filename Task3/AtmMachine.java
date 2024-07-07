package Task3;

import java.util.*;

public class AtmMachine extends UserBankAccount  {
     private double amount=5000;
   
    Scanner scanner = new Scanner(System.in);
    
       
    
    
    public void displayMenu()
    {
        
        System.out.println("Select the Options: 1: Widhdraw");
        System.out.println("Select the Options: 2: Deposit");
        System.out.println("Select the Options: 3: CheckBalnace");
        System.out.println("Select the Options: 4: Exit");
    }
    
    public void transaction()
    {
          while(true){
          displayMenu();
          System.out.println("Select the Options:");
            int choice = scanner.nextInt();
           
            if(choice==1)
            {
            withdraw(amount);
            continue;
                
            }
            else if(choice==2)
            {
                deposit(amount);
                continue;
                
            }
            else if(choice==3)
            {
                checkBalance(amount);
                continue;
            }
            else if(choice==4)
            {
                System.out.println("Thank you for using ATM.");
                break;
            }
            else{
                System.out.println("Invalid Input. Please select correct option.");
                continue;
            }
            
    }
    }
}
   

    