public class IntegerNestedIf{
    public static void main(String args[]) {
        
        int grade = 75;
        
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