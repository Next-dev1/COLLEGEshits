import java.util.Scanner;
public class IntegerIfElseUserInput {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
        int number;
        
        System.out.print("Enter number: ");
        number = sc.nextInt();
        
        if(number > 0){
            System.out.print("Number is greater than zero");
        }
        else{
            System.out.print("Number is less than zero");
        }
    }
}