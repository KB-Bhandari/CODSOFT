package Task2;


import java.util.*;

 class InvalidMarks extends Exception{
    public InvalidMarks( String msg)
    {
        super(msg);
    }
    
}
public class GradeReport {
    
 public static void main(String args[])

 {  
    int totalMarks=0;
    System.out.println("Enter Total number of subjects:");
    Scanner scanner=new Scanner(System.in);

    int TotalNoOfSubject=scanner.nextInt();
    System.out.println("Total no. of subjects are "+TotalNoOfSubject);
    int subjectCount=1;
    int[] subjectsMarks=new int [TotalNoOfSubject];
    
    System.out.println("Enter the marks of "+TotalNoOfSubject+" subjects each:");

    // taking marks of each subject

    for(int i=0;i<TotalNoOfSubject;i++)
    {
        System.out.print("Enter marks of subject "+subjectCount+" :");
        try{
        subjectsMarks[i]=scanner.nextInt();
        if(subjectsMarks[i]<0||subjectsMarks[i]>100)     // throwing an Exception if user enter invalid number
        {
            throw new InvalidMarks(" Marks should be between 0 to 100. Please enter correct marks.");
           
        }
        subjectCount++;
    }
     catch(InvalidMarks e){
        System.out.println("Invalid Marks entered:"+e.getMessage());
        i--;
     }
     
     catch(Exception e)
     {
        System.out.println("Invalid input, please enter number only.");
        scanner.next();
        i--;
     }
    }
    System.out.print("Your Marks are: ");


     for(int marks:subjectsMarks){
        
        System.out.print(marks+" ");
    
     } 
    
     System.out.println();

    //  calculating total marks
     for( int i=0;i<TotalNoOfSubject;i++){
          totalMarks+= subjectsMarks[i];
     }
    
        System.out.println("Your total Marks out of "+TotalNoOfSubject*100 +" is "+totalMarks);
        
    
        // Calculating Percentage
        int percentage=0;
        percentage=totalMarks/TotalNoOfSubject;
        System.out.println("Your Percentage is "+percentage+"%");

        // Grading
        if(percentage<=30)
        {
            System.out.println("Your got Grade D");
        }
        else if(percentage>30&&percentage<=50)
        {
            System.out.println("Your got Grade C");
        }
        else if(percentage>50&&percentage<80)
        {
            System.out.println("Your got Grade B");
        }
        // else if(percentage>80&&percentage<100)
        else
        {
            System.out.println("Your got Grade A");
        }
    scanner.close();
 }
}

