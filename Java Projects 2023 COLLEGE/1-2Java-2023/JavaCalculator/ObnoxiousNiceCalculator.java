import java.util.Scanner;

public class ObnoxiousNiceCalculator {
    // Declare class variables
    private static double firstNumber, secondNumber, result;
    private static String operator;

    public static void main(String[] args) {
        String choice = "y";
        Scanner scanner = new Scanner(System.in);

        do {
            
            // Print welcome message and prompts for user input
        
            System.out.println("****************************************************");
            System.out.println("*                                                  *");
            System.out.println("*      █▀▀ ▄▀█ █░░ █▀▀ █░█ █░░ ▄▀█ ▀█▀ █▀█ █▀█     *");
            System.out.println("*      █▄▄ █▀█ █▄▄ █▄▄ █▄█ █▄▄ █▀█ ░█░ █▄█ █▀▄     *");
            System.out.println("*                                                  *");
            System.out.println("*                                                  *");
            System.out.println("****************************************************");

            System.out.print("ENTER THE FIRST NUMBER : ");
            firstNumber = scanner.nextDouble();

            System.out.print("ENTER THE OPERATOR (+, -, *, /): ");
            operator = scanner.next();

            System.out.print("ENTER THE SECOND NUMBER : ");
            secondNumber = scanner.nextDouble();

            // Perform arithmetic operation based on user input
            
            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    
                    // Check for division by zero
                    
                    if (secondNumber == 0) {
                        System.out.println("ERROR: DIVISION BY ZERO  IS NOT ALLOWED!! .");
                        return;
                    }
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("ERROR: INVALID OPERATOR!! .");
                    return;
            }

            // Print result as a whole number
            
            System.out.println("RESULT : " + Math.round(result));

            System.out.print("DO YOU WANT TO CONTINUE? (y/n): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("THANK YOU FOR USING THE MOST OBNOXIOUS CALCULATOR :)");
        System.out.println("( ͡° ʖ̯ ͡°)");
   
    }
}