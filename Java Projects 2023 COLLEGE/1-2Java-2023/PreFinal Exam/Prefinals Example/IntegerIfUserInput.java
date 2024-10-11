import java.util.Scanner;
public class IntegerIfUserInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        int number;
        
        System.out.print("Enter number: ");
        number = sc.nextInt();
        
        if(number > 0){
            System.out.print("Number is greater than zero");
        }
        
    }
}