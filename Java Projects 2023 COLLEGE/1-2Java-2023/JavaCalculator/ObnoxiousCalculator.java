import java.util.Scanner;

public class ObnoxiousCalculator {
    // Declare class variables
    private static double firstNumber, secondNumber, result;
    private static String operator;

    public static void main(String[] args) {
        String choice = "y";
        Scanner scanner = new Scanner(System.in);

        do {
            // Print welcome message and prompts for user input
            System.out.println("**********************************************");
            System.out.println("*                                            *");
            System.out.println("*      █░█░█ █▀▀ █░░ █▀▀ █▀█ █▀▄▀█ █▀▀   : } *");
            System.out.println("*      ▀▄▀▄▀ ██▄ █▄▄ █▄▄ █▄█ █░▀░█ ██▄   : } *");
            System.out.println("*                                            *");
            System.out.println("**********************************************");
            System.out.println();

            System.out.print("ₑₙₜₑᵣ ₜₕₑ ᵳᵢᵣₛₜ ₙᵤₘ♭ₑᵣ: ");
            firstNumber = scanner.nextDouble();

            System.out.print("ₑₙₜₑᵣ ₜₕₑ ₒₚₑᵣₐₜₒᵣ (+, -, *, /): ");
            operator = scanner.next();

            System.out.print("ₑₙₜₑᵣ ₜₕₑ ₛₑ𝓬ₒₙ𝓭 ₙᵤₘ♭ₑᵣ: ");
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
                        System.out.println("Ｅｒｒｏｒ：　Ｄｉｖｉｓｉｏｎ　ｂｙ　ｚｅｒｏ　ｉｓ　ｎｏｔ　ａｌｌｏｗｅｄ．");
                        return;
                    }
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    return;
            }

            // Print result as a whole number
            System.out.println("𝖱౿ડυᥣ𝗍: " + Math.round(result));

            System.out.print("ᴰᵒ ʸᵒᵘ ʷᵃⁿᵗ ᵗᵒ ᶜᵒⁿᵗⁱⁿᵘᵉ? (y/n): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("ᴛʜᴀɴᴋ ʏᴏᴜ ғᴏʀ ᴜsɪɴɢ ᴛʜᴇ ᴍᴏsᴛ ᴏʙɴᴏxɪᴏᴜs ᴄᴀʟᴄᴜʟᴀᴛᴏʀ :)");


        


        
    }
}