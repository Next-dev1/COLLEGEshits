package CodingModing.LaboratoryExercise;

import java.util.Scanner;
// Create LabExer1B class
public class LabExer1B{
    // Declare private integer variable "num"
    private int num;

    // Create setter method for "num"
    public void setNum(int num) {
        this.num = num;
    }
    // Create getter method for "num"
    public int getNum(){
        return num;
    }
    

    // Main method
    public static void main(String[] args) {
        // Create an instance of LabExer1B
        LabExer1B number = new LabExer1B();
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        // Set the value of "num" using the setter method
        number.setNum(sc.nextInt());

        // Close the Scanner object
        sc.close();

        // Call the "showNumberPlus10" method
        showNumberPlus10(number.getNum());
        // Call the "showNumberPlus100" method
        showNumberPlus100(number.getNum());
        // Call the "showNumberPlus1000" method
        showNumberPlus1000(number.getNum());
    }

    // Method to display the sum of "num" and 10
    public static void showNumberPlus10(int num) {
        System.out.println(num + " plus 10 is " + (num + 10) + ".");
    }

    // Method to display the sum of "num" and 100
    public static void showNumberPlus100(int num) {
        System.out.println(num + " plus 100 is " + (num + 100) + ".");
    }

    // Method to display the sum of "num" and 1000
    public static void showNumberPlus1000(int num) {
        System.out.println(num + " plus 1000 is " + (num + 1000) + ".");
    }
}
