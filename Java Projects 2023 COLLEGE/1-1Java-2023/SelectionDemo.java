import java.util.Scanner;

public class SelectionDemo {
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    while(true){
    System.out.print("Enter Number:");
    int num = input.nextInt();

        // Selection Control Structures
        // if statement
        if(num == 0){
            System.out.println(num + " is zero!");
        }

        // if-else statement
        if(num % 2 == 0){
            System.out.println(num + " is even!");
        }else{
            System.out.println(num + " is odd!");
        }

        // else if statement
        if(num > 0){
            System.out.println(num + " is positive!");
        }else if(num < 0){
        System.out.println(num + " is negative!");
        }else{
            System.out.println(num + " is zero!");
        }
        
        // nested if statement
        if(num > 0){
            if(num > 50){
                System.out.println(num + " is greater than 50!");
        }else{
            System.out.println(num + " is less than 50!");
        }
    }

        // switch-case statement
        int tens = num / 10;
        switch (tens){
            case 1 : 
                System.out.println(num + " tens is 1!"); 
                break;
            case 2 : 
                System.out.println(num + " tens is 2!"); 
                break;
            case 3 : 
                System.out.println(num + " tens is 3!"); 
                break;
                default:
                System.out.println("tens is invalid");
        }

        // ternary operator (One line of code)
        // <condition> ? <exp if true> : <exp if false>
        // if(num % 2 == 0){
        //     System.out.println(num + " is even!");
        // }else{
        //     System.out.println(num + " is odd!");
        // }
        System.out.println(num % 2 == 0 ? "even" : "odd");

        int absolute = num > 0 ? num : num * -1;
        System.out.println("absolute value = " + absolute);

        } 

    }
}
