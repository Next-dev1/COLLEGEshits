import java.util.Scanner;
public class Login{
    public static void main(String [] args){
       Scanner input = new Scanner(System.in);
        
        int choice;
        
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.print("Enter your choice: ");
    choice = input.nextInt();
        
        if(choice == 1) {
            System.out.println("You have chosen addition");
            int num1, num2;
            
            System.out.print("Enter first number: ");
            num1 = input.nextInt();
            System.out.print("Enter second number: ");
            num2 = input.nextInt();
            
            int sum = num1 + num2;
            System.out.print("Sum is: " + sum);
        }
            else if(choice == 2){
                System.out.println("You have chosen subtraction");
                int num3, num4;
                System.out.print("Enter first number: ");
                num3 = input.nextInt();
                System.out.print("Enter second number: ");
                num4 = input.nextInt();
                int diff = num3 - num4;
                System.out.print("Difference is: " + diff);
            }
            
        }
    }
