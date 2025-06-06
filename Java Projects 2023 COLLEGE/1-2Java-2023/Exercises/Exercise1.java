package Exercises;
import java.util.Scanner;
public class Exercise1 {
    
    private String itemName;
    private int itemQuantity;
    private double itemPrice;
    private double amountDue;

    public void setName(String newItemName){
        itemName = newItemName;
    }

    public void setTotalCost(int quantity, double price){
        itemQuantity = quantity;
        itemPrice = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalCost(){
        amountDue = itemQuantity * itemPrice;
        return amountDue;
    }

    public void readInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of item you are purchasing. ");
        itemName = s.next();

        System.out.println("Enter the quantity and price separated by space. ");
        itemQuantity = s.nextInt();
        itemPrice = s.nextDouble();
        s.close();

    }

    public void writeOutput(){
        System.out.println("You are purchasing " + itemQuantity + " " + itemName + "  " + "(s) at " + itemPrice + " each.");

    }

    public static void main(String[] args){
        Exercise1 test = new Exercise1();
        test.readInput();
        test.writeOutput();
        System.out.println("Amount due is " + test.getTotalCost());
    }
        
    }
