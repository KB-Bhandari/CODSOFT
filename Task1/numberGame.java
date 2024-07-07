
package Task1;
import java.util.*;
/**
 * numberGame
 */
public class numberGame {
    public static void main(String[] args) {
        // System.out.println("helllo i am Komal");
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        int maxNumber=100;
        int minNumber=1;
        int maxAttempts=10;
        int score=0;
        int attempt=0;
        int randomNumber=0;
        // System.out.println(randomNumber);
        System.out.println("You can attempt only "+maxAttempts+" times.");
        System.out.println("Enter number between 1 to 100: ");
        while (true) {
            
        
        randomNumber= random.nextInt(101);
        while(attempt<maxAttempts){
        try {
            
            int yourNumber=Integer.parseInt(scanner.nextLine());
            //  System.out.println("random"+randomNumber);
             if(yourNumber>maxNumber||yourNumber<minNumber)
                {
                    System.out.println("Enter number in range of "+minNumber+" and "+maxNumber);
                   
                    continue;
                } 
                attempt++;
                System.out.println("You have attempted "+ attempt +" times.");
                if(yourNumber>randomNumber&& (yourNumber-randomNumber)<=5){
                    System.out.println("Your guess is close");
                }
                else if(yourNumber>randomNumber&& (yourNumber-randomNumber)>5)
                {
                    System.out.println("Your guess is too high");
                }
                else if(yourNumber<randomNumber&& (randomNumber-yourNumber)<=5){
                    System.out.println("Your guess is close");
                }
                else if(yourNumber<randomNumber && (randomNumber-yourNumber)>5)
                {
                    System.out.println("Your guess is too low.");
                }
                else{
                    System.out.println("Hurry!!!!!!!!! You guessed correct number");
                                        
                score+=5;
                System.out.println("Your score: "+score);
                 break;
            }
              }
               catch (NumberFormatException e) {
            // TODO Auto-generated catch block
           
            // e.printStackTrace();
            System.out.println("Invalid input: Only numbers are accepted, please enter any number.");
        }
        
        }
        if(attempt==maxAttempts){
            System.out.println("You have used all attempts");
            
            System.out.println("The number was "+randomNumber);
            break;
        }
        System.out.println("Want to play again???? Enter (Y) to play again or (N) to not.");
        String playAgain=scanner.nextLine().trim().toUpperCase();
        if(!playAgain.equals("Y")){
            break;
        }
        else{
            System.out.println("Enter number to guess value :");
        }
    }
        System.out.println("Your score: "+score);
        scanner.close();
        
    }
    
}