import java.util.Scanner;
import java.util.InputMismatchException;

public class LabExer5A {
    public static void main (String [] args){
        
        int randomNumber = 9;
        int numoftries = 1;
        
        Scanner sc = new Scanner (System.in);
        
        int guess = 0;
        
        System.out.println("Guess a number from 1 to 50! ");
        
        do {
            try{
                
             guess = sc.nextInt();
                
                if (guess < 1 || guess > 50)
                    throw new OutOfRangeException();
                if (guess == randomNumber) {
                    System.out.println("You got it in " + numoftries + " attempt(s)!");
                    numoftries++;
                    
                    
                }else if (guess < randomNumber){
                    System.out.println("Too Low Try again.");
                    numoftries++;
                    
                }else if (guess > randomNumber){
                    System.out.println("Too High Try again.");
                    numoftries++;
                    
               
              }
               
              } catch (InputMismatchException ex){
               System.out.println("Invalid input. ");
               System.out.println("Guess a number from 1 to 50!");
               sc.next();
              } catch (OutOfRangeException xe){
               System.out.println(xe.getMessage());
               System.out.println("Guess a number from 1 to 50!");
               sc.next();
               
              }
              
            } while (guess != randomNumber);
        }
    }
    
    class OutOfRangeException extends Exception {
        public OutOfRangeException (){
        super ("Out of range.");
        
    }
}
                
                
