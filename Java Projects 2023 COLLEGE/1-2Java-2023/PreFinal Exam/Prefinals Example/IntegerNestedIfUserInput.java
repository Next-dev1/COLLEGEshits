import java.util.Scanner;
public class IntegerNestedIfUserInput{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
        int grade;
        
        System.out.print("Enter grade: ");
        grade = sc.nextInt();
        if(grade >= 75 && grade <= 100){ //using logical && we only set the grade from 75 to 100 only.
            System.out.print("You passed");
        }
        else if(grade <= 74 && grade >= 60){ //using logical && we only set the grade from 60 to 74 only.
            System.out.print("You failed");
        }
        else{
            System.out.print("Grade is invalid");
        }
        
    }
}